package sam;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InsertArr {
public static void main(String[] args) {
	ArrayList <Integer> arr = new ArrayList<Integer>();
	Scanner scan = new Scanner(System.in);
//	System.out.println("Give Insert Index");
//	int ind = scan.nextInt();
//	System.out.println("Give insert value");
//	int ins = scan.nextInt();
//	arr.set(ind, ins);
	//Im more used to arraylist, thats why.
	System.out.println("Give me the big number");
	int val = scan.nextInt();
	Random r = new Random();
	for (int i = 0; i < 100; i++) {
		int n = r.nextInt(10);
		arr.add(n);
		int s =arr.indexOf(val - arr.get(i));
		if(arr.contains(val - arr.get(i)))
		{
		System.out.println("Your two values are "+arr.get(i)+ " and "+arr.get(s));
	}
		
	}
		
	}
	}

