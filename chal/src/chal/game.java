package chal;

import java.util.Random;

import apcs.Window;
import apcs.Window.key;

public class game {
	static game g = new game();
	static box[][] arr = new box[4][4];
	static int i = 0;
	static int j = 0;

	public static void main(String[] args) {
		Window.size(600, 600);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {

				arr[i][j] = new box(100 + (j * 150), 100 + (i * 150), "2");
				arr[i][j].draw();

			}

		}
		while (g.checkWin()) {
			Window.frame();

			g.moveLeft();
			g.moveRight();
			g.moveDown();
			g.moveUp();

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j].draw();
				}
			}

		}

	}

	public void moveRight() {
		if (Window.key.pressed("right")) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (j != 3) {
						if (arr[i][j + 1].label.equals(arr[i][j].label)) {
							int s = Integer.parseInt(arr[i][j].label) + Integer.parseInt(arr[i][j + 1].label);
							arr[i][j + 1].label = "" + s;
							arr[i][j].label = "";

						} else if (arr[i][j + 1].label.equals("")) {
							String tempVal = arr[i][j + 1].label;
							arr[i][j + 1].label = arr[i][j].label;
							arr[i][j].label = tempVal;
						}
					}
				}
			}
		}
	}

	public void moveLeft() {
		if (Window.key.pressed("left")) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (j != 0) {
						if (arr[i][j].label.equals(arr[i][j - 1].label)) {
							int s = Integer.parseInt(arr[i][j].label) + Integer.parseInt(arr[i][j - 1].label);

							arr[i][j - 1].label = "" + s;
							arr[i][j].label = "";
						} else if (arr[i][j - 1].label.equals("")) {
							String tempVal = arr[i][j - 1].label;
							arr[i][j - 1].label = arr[i][j].label;
							arr[i][j].label = tempVal;
						}
					}
				}
			}
		}
	}

	public void moveUp() {
		if (Window.key.pressed("Up")) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (i != 0) {
						if (arr[i][j].label.equals(arr[i - 1][j].label)) {
							int s = Integer.parseInt(arr[i][j].label) + Integer.parseInt(arr[i - 1][j].label);
							arr[i - 1][j].label = "" + s;
							arr[i][j].label = "";

						} else if (arr[i - 1][j].label.equals("")) {
							String tempVal = arr[i - 1][j].label;
							arr[i - 1][j].label = arr[i][j].label;
							arr[i][j].label = tempVal;
						}
					}
				}
			}
		}
	}

	public void moveDown() {
		if (Window.key.pressed("Down")) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (i != 3) {
						if (arr[i][j].label.equals(arr[i + 1][j].label)) {
							int s = Integer.parseInt(arr[i][j].label) + Integer.parseInt(arr[i + 1][j].label);
							arr[i + 1][j].label = "" + s;
							arr[i][j].label = "";

						} else if (arr[i + 1][j].label.equals("")) {
							String tempVal = arr[i + 1][j].label;
							arr[i + 1][j].label = arr[i][j].label;
							arr[i][j].label = tempVal;
						}
					}
				}
			}
		}
	}

	public boolean checkWin() {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j].label.equals("2048")) {
					flag = false;
				}
			}

		}
		return flag;
	}
	public void generate()
	{
		Random r = new Random();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				Boolean b = r.nextBoolean();
				if(arr[i][j].label.equals(""))
				{
					count+=1;
				}
				if(count > 0)
				{
					if(b)
					{
						arr[i][j].label.equals("2");
					}
					else
					{
						arr[i][j].label.equals("4");
					}
					count = 0;
					
				}
			}
		}
	}
}