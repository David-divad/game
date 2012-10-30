package org.deiv.game.graphics.surface;

import android.content.Context;

import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;

public class CanvasSurface extends SurfaceView implements Surface {

	
	public CanvasSurface(Context context)
	{
		super(context);	
	}

	public void setRenderer(org.deiv.game.renderer.Renderer renderer) 
	{
		getHolder().addCallback((Callback) renderer);;
	}
}
