package org.deiv.game;

import org.deiv.game.Screen.Screen;
import org.deiv.game.graphics.Graphics;

public abstract class Game {
	
	protected Screen currentScreen;
	protected Graphics graphics;

	public Game()
	{

	}
		
	public Screen getCurrentScreen() 
	{
		return currentScreen;
	}
	
	public void changeScreen(Screen screen) 
	{
		/* XXX: handle pre-change */
		this.currentScreen = screen;
	}
	
	public Graphics getGraphics() { return graphics; };
}
