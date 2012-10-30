package org.deiv.game.renderer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import org.deiv.game.graphics.Graphics;

public class OpenGLRenderer extends Renderer implements android.opengl.GLSurfaceView.Renderer {

	public OpenGLRenderer(Graphics graphics)
	{
		super(graphics);
	}
	
	//@Override
	public final void onDrawFrame(GL10 arg0) 
	{
		onDrawFrame();
	}

	//@Override
	public final void onSurfaceChanged(GL10 arg0, int arg1, int arg2) 
	{
		// TODO Auto-generated method stub
		
	}

	//@Override
	public final void onSurfaceCreated(GL10 arg0, EGLConfig arg1) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void onSurfaceChanged() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void onSurfaceCreated() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void onsurfaceDestroyed() 
	{
		// TODO Auto-generated method stub
		
	}

}
