package im;

import java.util.Random;

public class cards {
	public static void main(String[] args) {
		String arr[] = new String[52];
		cards c = new cards();
		char charr[] = { 'S', 'D', 'C', 'H' };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				arr[j + i * 13] = charr[i] + "" + (j + 1);
			}
		}
		System.out.println("base array");
		c.printArr(arr);
		c.shuffle(arr);
		System.out.println("shuffled array:");
		c.printArr(arr);
		c.bubSort(arr);
		System.out.println("Sorted array:");
		c.printArr(arr);
		// c.shuffle(arr);

	}

	public void shuffle(String[] arr) {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			String tempval = arr[i];
			int random = r.nextInt(52);
			arr[i] = arr[random];
			arr[random] = tempval;

		}
	}

	public void sort(String[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
		
				if (arr[j+1].compareTo(arr[j]) < 0) {
					if (arr[j].charAt(0) != arr[j + 1].charAt(0)) {
						String tempVal = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tempVal;
					} else if (arr[j+1].length() <= arr[j].length()) {
						String tempVal = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = tempVal;
					}
				}
				if(i != )
			}
		}
       
      
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		
	}
	

	public static void printArr(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
	}
	public void bubSort(String[] arr)
	{
			int n = arr.length;
				for (int i = 0; i < n-1; i++) {
					for (int j = 0; j < n-i-1; j++) {
						String temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
				
	}

}
