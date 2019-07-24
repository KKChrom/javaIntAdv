package pie;

import apcs.Window;

public class Rectangle extends Shape{
	int l;
	int w;
	public Rectangle(int l, int w) {
		// TODO Auto-generated constructor stub
		super();
		this.l = 40;
		this.w = 200;
	}
	@Override
	public void drawShape() {
		Window.out.color("yellow");
		Window.out.rectangle(x, y, l, w);
	}
}
