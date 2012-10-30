package org.deiv.game.graphics;

import org.deiv.game.Screen.Screen;
import org.deiv.game.graphics.surface.Surface;
import org.deiv.game.renderer.CanvasRenderer;
import org.deiv.game.renderer.Renderer;


public class Graphics {

	protected Surface surface;
	protected Renderer renderer;
	
	public Graphics(Surface surface)
	{
		this.surface = surface;
	}
	
	public Surface getSurface() 
	{
		return surface;
	}
	
}
