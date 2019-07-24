package pie;

import apcs.Window;

public class Circle extends Shape{

int radius;
	public Circle(int radius) {
		super();
		this.radius = 30;
	}
	@Override
public void drawShape() {
	Window.out.color(color);
	Window.out.circle(x, y, radius);
}
}
