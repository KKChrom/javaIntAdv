package sam;

//import java.util.ArrayList;
import java.util.Random;

public class hugeArray {
	public static void main(String[] args) {
//		ArrayList<String> str = new ArrayList<String>();
		int[] anArray = new int[10000];
		Random r = new Random();
		int ctwo = 0;
		int bigValtwo = 0;
		for (int i = 0; i < 10000; i++) {
			anArray[i] = r.nextInt(2001);
			ctwo += anArray[i];
			if (bigValtwo < anArray[i]) {
				bigValtwo = anArray[i];
			}
		}
		System.out.println(
				"The sum of all elements in the array list is " + ctwo + ", while the biggest value is " + bigValtwo);
	}

}
