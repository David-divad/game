package org.deiv.game;

import org.deiv.game.graphics.Graphics;
import org.deiv.game.graphics.surface.CanvasSurface;
import org.deiv.game.graphics.surface.Surface;
import org.deiv.game.renderer.CanvasRenderer;
import org.deiv.game.renderer.Renderer;

import android.content.Context;

public class CanvasGame extends Game {


	protected CanvasSurface surface;
	protected CanvasRenderer renderer;
	
	public CanvasGame(Context context) 
	{
		super();
		
		surface = new CanvasSurface(context);
		//graphics = new Graphics(surface);
		
		renderer = new CanvasRenderer(this);
	}

}
