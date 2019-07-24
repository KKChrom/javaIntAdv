package pie;

import apcs.Window;

public class Square extends Shape {
	int side;
	public Square(int side)
	{
		super();
		this.side = 20;
	}
@Override
public void drawShape() {
	Window.out.color("green");
	Window.out.square(x, y, side);
}
}
