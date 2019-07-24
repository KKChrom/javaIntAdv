package pie;

import apcs.Window;

public class Œöp {
public static void main(String[] args) {
	Window.out.background("Blue");
	Shape s = new Shape();
	s.drawShape();
	Shape c=  new Circle(30);
	c.drawShape();
	Shape[] sli = new Shape[5];
	sli[0] = new Circle(30);
	sli[1] = new Square(20);
	sli[2] = new Rectangle(10,20);
	sli[0].drawShape();
	sli[1].drawShape();
	sli[2].drawShape();
	for(int i = 0;i<5;i++)
	{
		
	}
}
}
