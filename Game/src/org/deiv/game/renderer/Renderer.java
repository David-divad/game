package org.deiv.game.renderer;

import org.deiv.game.Game;
import org.deiv.game.graphics.Graphics;

import android.os.SystemClock;

public abstract class Renderer {

	protected Game game = null;
	protected GameLoop gameLoop = null;
	
	public Renderer(Game game)
	{
		this.game = game;
		this.gameLoop = new GameLoop();
	}
	
	public void onDrawFrame()
	{
		gameLoop.doFrame();
	}
	
	public abstract void onSurfaceChanged();
	public abstract void onSurfaceCreated();
	public abstract void onsurfaceDestroyed();
	
	protected class GameLoop {
		
        final int TICKS_PER_SECOND = 50;
        final int SKIP_TICKS = 1000 / TICKS_PER_SECOND;
        final int MAX_FRAMESKIP = 5;
        
        long next_game_tick = SystemClock.uptimeMillis();
        int loops;
        float interpolation;
        
        public void doFrame()
        {
            loops = 0;
            
            while( SystemClock.uptimeMillis() > next_game_tick && loops < MAX_FRAMESKIP) {
            	
            	game.getCurrentScreen().update();

                next_game_tick += SKIP_TICKS;
                loops++;
            }

            interpolation = (float)( SystemClock.uptimeMillis() + SKIP_TICKS - next_game_tick )
                            / (float)( SKIP_TICKS );

            game.getCurrentScreen().draw(game.getGraphics(), interpolation);
        }
	}
}
