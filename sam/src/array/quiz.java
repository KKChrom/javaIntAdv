package array;

import java.util.Scanner;

public class quiz {
public static void main(String[] args) {
//	int arr[][] = new int[5][5];
//	for (int i = 1; i < arr.length; i++) {
//		for (int j = 1; j < arr[0].length; j++) {
//			arr[i][j] = (int) Math.pow(i, j);
//			System.out.println(arr[i][j]);
//		}
	
	
	
	
	}
	public double averageRainfall(double arr[][])
	{
		Scanner s = new Scanner(System.in);
				System.out.println("Is it a leap year? (yes or no)");
				String st = s.next();
				
		double total = 0.0;
		double average = 0.0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				total += arr[i][j];
				
			}
		}
		if(st.toLowerCase().equals("yes"))
		{
			average = total/366;
		}
		else
		{
			average = total/365;
		}
		return average;
	}
}

