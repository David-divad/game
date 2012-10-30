package org.deiv.game.math._2d;

import android.util.FloatMath;

public class Vector {
	
	public static float TO_RADIANS = (1 / 180.0f) * (float) Math.PI;
	public static float TO_DEGREES = (1 / (float) Math.PI) * 180.0f;

	public float x;
	public float y;
	
	public Vector(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	public Vector(Vector v)
	{
		this.x = v.x;
		this.y = v.y;
	}
	
	public Vector set(float x, float y) 
	{
		this.x = x;
		this.y = y;
		
		return this;
	}
	
	public Vector set(Vector v) 
	{
		this.x = v.x;
		this.y = v.y;
		
		return this;
	}
		
	public Vector add(Vector v)
	{
		this.x += v.x;
		this.y += v.y;
		
		return this;
	}
	
	public Vector add(float x, float y)
	{
		this.x += x;
		this.y += y;
		
		return this;
	}
	
	public Vector sub(Vector v)
	{
		this.x -= v.x;
		this.y -= v.y;
		
		return this;
	}
	
	public Vector sub(float x, float y)
	{
		this.x -= x;
		this.y -= y;
		
		return this;
	}
	
	public Vector mul(float scalar) 
	{
		this.x *= scalar;
		this.y *= scalar;
		
		return this;
	}

	public float length() 
	{
		return FloatMath.sqrt((x * x) + (y * y));
	}
	
	public Vector normalize() 
	{
		float len = length();
		
		if (len != 0) {
			this.x /= len;
			this.y /= len;
		}
		
		return this;
	}

	public float angle() 
	{
		float angle = (float) Math.atan2(y, x) * TO_DEGREES;
		
		if (angle < 0) angle += 360;
		
		return angle;
	}

	public Vector rotate(float angle) 
	{
		float rad = angle * TO_RADIANS;
		float cos = FloatMath.cos(rad);
		float sin = FloatMath.sin(rad);
		float newX = this.x * cos - this.y * sin;
		float newY = this.x * sin + this.y * cos;
		
		this.x = newX;
		this.y = newY;
		
		return this;
	}
	
	public float dist(Vector v) 
	{
		float distX = this.x - v.x;
		float distY = this.y - v.y;
		
		return FloatMath.sqrt(distX * distX + distY * distY);
	}
	
	public float dist(float x, float y) 
	{
		float distX = this.x - x;
		float distY = this.y - y;
		
		return FloatMath.sqrt(distX * distX + distY * distY);
	}

}
