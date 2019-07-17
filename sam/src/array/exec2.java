package array;

import java.util.ArrayList;
import java.util.Random;

public class exec2 {
	public static void main(String[] args) {
		int myArr[][] = new int[10][20];
		Random v = new Random();
		Random o = new Random();
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[0].length; j++) {
			myArr[i][j] = v.nextInt(50);
			if(o.nextInt(2) == 1)
			{
				myArr[i][j] = -myArr[i][j];
			}
			}
			int[] bar = new int[1];
			bar[0] = 5;
			System.out.println(bar[0]);
			int[] arr = new int[1];
		 System.arraycopy(bar, bar.length, arr, arr.length, arr.length);
		 System.out.println(arr[0]);
		}
		changeNegs(myArr);
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[0].length; j++) {
			System.out.println(myArr[i][j]);
			}
			
		}
		
	}
	public static void changeNegs(int[][] mat)
	{
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
			if(mat[i][j]<0)
			{
				mat[i][j] = 0;
				}
			}
			}
	}
}
