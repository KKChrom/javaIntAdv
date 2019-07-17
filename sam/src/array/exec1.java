package array;

import java.util.Random;

public class exec1 {
public static void main(String[] args) {
	int myArr[][] = new int[3][4];
	Random v = new Random();
	int sum = 0;
	for (int i = 0; i < myArr.length; i++) {
		for (int j = 0; j < myArr[0].length; j++) {
		myArr[i][j] = v.nextInt(100);
			myArr[i][j] = 10;
		
			if(i==2)
			{
//				myArr[i][j] +=10;
				rowAdd(myArr);
			}
			if(j==2)
			{
//				myArr[i][j] += 10;
				colAdd(myArr);
			}
			sum += myArr[i][j];
		}
		
	}
	System.out.println(sum);
}
public static void colAdd (int a[][])
{
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			if(j==2)
			{
				a[i][j] += 10;
			}
			
		}
	}
	
}
public static void rowAdd(int a[][])
{
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			if(i==2)
			{
				a[i][j] += 10;
			}

		}
	}
	}


}
