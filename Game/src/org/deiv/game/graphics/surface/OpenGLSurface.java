package org.deiv.game.graphics.surface;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class OpenGLSurface extends GLSurfaceView implements Surface {

	public OpenGLSurface(Context context)
	{
		super(context);
	}

	public void setRenderer(org.deiv.game.renderer.Renderer renderer) 
	{
		setRenderer(renderer);
	}
}
