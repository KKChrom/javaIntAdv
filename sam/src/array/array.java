package array;

import java.util.Random;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give Rows for arrays");
		int r = scan.nextInt();
		System.out.println("Give cols for arrays");
		int c = scan.nextInt();
		int myArr[][] = new int[c][r];
		int arrtwo[][] = new int[c][r];
		int combArr[][] = new int[c][r];
		Random v = new Random();
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[0].length; j++) {
				myArr[i][j] = v.nextInt(100);
				arrtwo[i][j] = v.nextInt(100);
				combArr[i][j] = myArr[i][j]+arrtwo[i][j];

			}
		}
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[0].length; j++) {
				System.out.println(myArr[i][j]+" + "+arrtwo[i][j]+" = "+combArr[i][j]);

			}
		}

	}
}
