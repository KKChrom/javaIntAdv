package sam;

import java.util.ArrayList;
import java.util.Random;

public class arrayCalc {
public static void main(String[] args) {
//	int[] arr =  new int[100];
//	int avg = 0;
//	int min = 10000;
//	int max = 0;
//	Random r = new Random();
//	for (int i = 0; i < arr.length; i++) {
//		arr[i] = r.nextInt(100);
//		if(arr[i] > max)
//		{
//			max = arr[i];
//		}
//		if(arr[i]<min)
//		{
//			min = arr[i];
//		}
//		avg+= arr[i];
//	}
//	int average = avg/arr.length;
//	System.out.println("The average of the array is "+average+", The Max/Min is "+max+"/"+min);
	ArrayList<Integer> arr = new ArrayList<>();
	int avg = -1;
	int min = 10000;
	int max = -1;
	Random r = new Random();
	for (int i = 0; i < 100; i++) {
		int n = r.nextInt(900);
		arr.add(n);
		if(n > max)
		{
			max = n;
		}
		if(n<min)
		{
			min = n;
		}
		avg += n;
	}
	double average = avg/arr.size();
	System.out.println("The average of the array is "+average+", The Max/Min is "+max+"/"+min);
}
}
