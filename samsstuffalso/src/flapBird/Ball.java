package flapBird;

import apcs.Window;

public class Ball {
	int rad;
	int x;
	int y;
	int deltaX;
	int deltaY;
	String color;
	public void move()
	{
//		Window.out.circle(x, y, rad);
		y-= deltaY;
		
	}
	public void draw()
	{
		Window.out.color(color);
		Window.out.circle(x, y, rad);
	}
	public void decline()
	{
		y+= 10;
	}
	public Ball(int x, int y, int rad, int deltaX, int deltaY,String color)
	{
		this.rad = rad;
		this.x = x;
		this.y = y;
		this.deltaX = deltaX;
		this.deltaY = deltaY;
		this.color = color;
	}
	
}

