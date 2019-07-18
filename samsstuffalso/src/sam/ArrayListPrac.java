package sam;


import java.util.*;

import apcs.Window;

public class ArrayListPrac {
	public static void main(String[] args) {
		Window.frame();
		Scanner scan = new Scanner(System.in);
		System.out.println("What do you want to run(1-5)");
		int s = scan.nextInt();
		if (s == 1) {
			System.out.println("What is the index");
			s = scan.nextInt();

			getRandomIntList(s);
		} else if (s == 2) {
			System.out.println("What is the first index?");
			s = scan.nextInt();
			System.out.println("What is the second index?");
			int j = scan.nextInt();
			ArrayList<Integer> val = new ArrayList<Integer>();
			swap(val, s, j);
		} else if (s == 3) {
			ArrayList<Integer> val = new ArrayList<Integer>();
			printEvens(val);
		} else {
			System.out.println("val too big");
		}	
	}

	public static ArrayList<Integer> getRandomIntList(int size) {
		Random r = new Random();
		ArrayList<Integer> innt = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			innt.add(r.nextInt(100));
		}
		return innt;
	}

	public static void swap(ArrayList<Integer> list, int i, int j) {
		int iIndex = list.get(i);
		int jIndex = list.get(j);
		list.set(i, jIndex);
		list.set(j, iIndex);
		System.out.println(list);
	}

	public static void printEvens(ArrayList<Integer> a) {
		String s = "";
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) % 2 == 0) {
				s += +a.get(i) + ",";
			}
		}
		System.out.println(s);
	}
}
