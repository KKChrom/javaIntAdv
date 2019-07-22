package chal;

import java.util.Random;
import java.util.Scanner;

public class Casino {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("What is your cash input?");
	double val = s.nextDouble();
	System.out.println("What is your multiplier");
	double mult = s.nextDouble();
	Dealer d = new Dealer(val,mult);
	Random r = new Random();
	int big = r.nextInt((int)mult*5+1);
	if(big == 1)
	{
		System.out.println("your acquired value is "+d.deal());
	}
	else
	{
		System.out.println("Bust, you lost it all");
	}
}
}
