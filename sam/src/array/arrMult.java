package array;

import java.util.Random;

public class arrMult {
	public static void main(String[] args) {
		int myArr[][] = new int[2][2];
		int array[][] = new int[2][2];
		int newArr[][] = new int[2][2];
		int sum = 0;
		Random v = new Random();
	
		for (int i = 0; i < myArr.length; i++) {
			for (int j = 0; j < myArr[0].length; j++) {
//			myArr[i][j] = v.nextInt(5);
//			array[i][j] = v.nextInt(5);
				myArr[i][j] = 2134781093;
				array[i][j] = 2134781093;
				}
			
		}
		for(int i =0;i<myArr.length;i++)
		{
			for(int j = 0;j<myArr[0].length;j++)
			{
				for(int l =0; l<myArr.length;l++)
				{
				newArr[i][j] += myArr[i][j] * array[i][j];
				newArr[i][j] += myArr[i][j] * array[i][j];
				sum += myArr[i][j] * array[j][l];
			}
				newArr[i][j] = sum;
				sum = 0;
			}
		
		}
		for(int i =0;i<myArr.length;i++)
		{
			for(int j =0;j<myArr.length;j++)
			{
				System.out.println(newArr[i][j]);
			}
		}
	}
}
