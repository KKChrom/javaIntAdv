package chal;
import apcs.Window;

public class box {
	int x;
	int y;
	int iindex;
	int jindex;
	String label;
	public box(int x, int y, String label)
	{
		this.x = x;
		this.y = y;
		this.label = label;
		
	}
	public void draw()
	{
		Window.out.color("green");
		Window.out.square(x, y, 50);
		Window.out.color("blue");
		Window.out.fontSize(30);
		Window.out.print(label, x-10, y+10);
	}

	}
	
