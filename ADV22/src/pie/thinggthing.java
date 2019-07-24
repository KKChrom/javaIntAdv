package pie;

import java.util.Scanner;

public class thinggthing {
public static void main(String[] args) {
	// if i to j + j to k < i to k
			// i to k = i to j + j to k
	Scanner s = new Scanner(System.in);
	System.out.println("rows?");
	int r = s.nextInt();
	System.out.println("Col?");
	int c = s.nextInt();
	int[][] arr = new int[r][c];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[0].length; j++) {
			arr[i][j] = 0x3f3f3f3f;
		}
	}
	for (int i = 0; i < arr.length; i++) {
		arr[i][i] = 0;
	}
	while(true)
	{
		//System.out.println("Vertex 1?");
		int x = s.nextInt();
		//System.out.println("Vertex 2?");
		int y = s.nextInt();
		//System.out.println("Distance?");
		int d = s.nextInt();
		
		if (x == -1) {
			break;
		}
		arr[x][y] = d;
		arr[y][x] = d;
	}
	for(int k = 0; k < arr.length;k++)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][k] + arr[k][j] < arr[i][j])
				{
					arr[i][j] = arr[i][k] + arr[k][j];
				}
			}
		}
	}
	System.out.println(arr[0][4]);
	
}
}
