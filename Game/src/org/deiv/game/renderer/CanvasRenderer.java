package org.deiv.game.renderer;

import org.deiv.game.graphics.Graphics;

import android.view.SurfaceHolder;

public class CanvasRenderer extends Renderer implements SurfaceHolder.Callback {
	
	
	public CanvasRenderer(Graphics graphics)
	{
		super(graphics);
	}

	//@Override
	public final void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public final void surfaceCreated(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public final void surfaceDestroyed(SurfaceHolder arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public final void onSurfaceChanged() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void onSurfaceCreated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public final void onsurfaceDestroyed() {
		// TODO Auto-generated method stub
		
	}
	
	class RenderThread extends Thread {
		
	    private boolean run = false;
	 
	    public void setRunning(boolean run) 
	    {
	        this.run = run;
	    }
	 
	    @Override
	    public void run() 
	    {
	        while (run)  {
	        	onDrawFrame();
	        }
	    }
	}


}
