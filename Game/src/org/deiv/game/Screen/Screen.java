package org.deiv.game.Screen;

import org.deiv.game.graphics.Graphics;

public abstract class Screen {
	
	//private Graphics graphics = null;
	
	public Screen(/*Graphics graphics*/)
	{
		//this.graphics = graphics;
	}
	
	/**
	 * Update game and physics.
	 * 
	 */
	public abstract void update();
	
	/**
	 * Draw the screen using the passed graphics.
	 * 
	 * @param graphics
	 */
	public abstract void draw(Graphics graphics, float interpolation);
}
