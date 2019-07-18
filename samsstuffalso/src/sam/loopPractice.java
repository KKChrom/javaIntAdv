package sam;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class loopPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to run(1-5)");
		int s = scan.nextInt();
		if (s == 1) {
			taskOne();
		} else if (s == 2) {
			System.out.println("What is the number input");
			s = scan.nextInt();
			taskTwo(s);
		} else if (s == 3) {
			System.out.println("What is the number input");
			s = scan.nextInt();
			taskThree(s);
		} else if (s == 4) {
			taskFour();
		} else if (s == 5) {
			taskFive();
		} else {
			System.out.println("Too big");
		}

	}

	public static void taskOne() {
		int s = (int) (Math.random() * 100);
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("What is your value");
			int l = scan.nextInt();
			if (l > s) {
				JOptionPane.showMessageDialog(null, "Guess Lower");
			} else if (l < s) {
				JOptionPane.showMessageDialog(null, "Guess Higher");
			} else if (l == s) {
				System.out.println("Correct!");
				break;
			}
		}
	}

	public static int taskTwo(int s) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Give value for the natural numbers to go up to");
//	int s= scan.nextInt();
		int totalVal = 0;
		int squareVal = 0;
		for (int i = 0; i < s; i++) {
			squareVal = i * i;
			totalVal += squareVal;
		}
		return totalVal;
	}

	public static int taskThree(int s) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Give value for the numbers to go up to");
//	int s= scan.nextInt();
		int totalVal = 0;
		int squareVal = 0;
		for (int i = 0; i < s; i++) {
			squareVal += i;
		}
		totalVal = squareVal * squareVal;
		return totalVal;
	}

	public static void taskFour() {
		int bigVal = taskTwo(100) - taskThree(100);
		System.out.println("The difference between the sumofsquares and the square of sums is " + bigVal);
	}

	public static void taskFive() {
		int totalVal = 0;
		int i = 0;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your big number?");
		int l = scan.nextInt();
		scan.close();
		for (i = 1; i <= n; i++) {
			int counter = 0;
			if (i % n == 0) {
				counter = counter + 1;
			}
			if (counter == 2) {
				totalVal += i;
			}
		}

		System.out.println(totalVal);
	}
}
