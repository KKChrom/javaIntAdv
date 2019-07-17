package array;
public class quiz {
public static void main(String[] args) {
	int arr[][] = new int[5][5];
	for (int i = 1; i < arr.length; i++) {
		for (int j = 1; j < arr[0].length; j++) {
			arr[i][j] = (int) Math.pow(i, j);
			System.out.println(arr[i][j]);
		}
	}
	
}
}
