package flapBird;

import apcs.Window;

public class Rectangle {
	int width;
	int	height;
	String color;
	int x;
	int deltaX;
	int y;
	public Rectangle(int width, int height, int x,String color , int deltaX)
	{
		this.width = width;
		this.height = height;
		this.color = color;
		this.deltaX = deltaX;
		this.x = x;
		
	}
	public void draw()
	{
		
		Window.out.color(color);
		Window.out.rectangle(x, 0, width, height);
		Window.out.color(color);
		Window.out.rectangle(x, Window.height(), width, height);
		

	}
	public void move()
	{
		x-= deltaX;
	}
}
