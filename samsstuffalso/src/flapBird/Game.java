package flapBird;

import java.util.Random;

import apcs.Window;

public class Game {
	public static void main(String[] args) {
		int Score = 0;
		Window.size(500, 500);
		Ball bird = new Ball(80, 80, 20, 10, 25, "yellow");
		Random r = new Random();
		Rectangle r1 = new Rectangle(50, 200, Window.width(), "red", 10);

		while (true) {
			bird.decline();
			bird.draw();
			r1.move();
			r1.draw();	
			if(bird.x <= r1.x+r1.width/2 && bird.x >= r1.x-r1.width/2 && bird.y <= 200  )
			{
				Window.out.color("white");
				System.out.println("gamem over");
				Window.out.print("Game Over", Window.width() / 2, Window.height());
				Window.sleep(30);
				break;
			}
			if(bird.x <= r1.x+r1.width/2 && bird.x >= r1.x-r1.width/2 && bird.y >= 400  )
			{
				Window.out.color("white");
				System.out.println("gamem over");
				Window.out.print("Game Over", Window.width() / 2, Window.height());
				Window.sleep(30);
			
				break;
			}
			Window.out.color("white");
			Window.out.print(Score, Window.width() / 2, 50);
			Window.frame();
			if (bird.x - bird.rad == r1.x) {
				Score++;
				Window.sleep(20);
				Window.out.print(Score, Window.width() / 2, 50);
			}

			if (r1.x <= 0) {
				if (Score % 2 == 0) {
					r1.color = "green";
					r1.height += r.nextInt(100);
				} else {
					r1.color = "blue";
					r1.height -= r.nextInt(100);
				}

				r1.x = Window.width();
			
			}
			if (bird.y - bird.rad >= Window.height()) {
				Window.out.color("white");
				Window.out.print("Game Over", Window.width() / 2, Window.height());
				Window.sleep(30);
				break;
			}

			if (Window.key.pressed("space")) {
				bird.move();
				Window.sleep(10);
			}

		}

	}
}
