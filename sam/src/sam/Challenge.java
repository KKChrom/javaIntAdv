package sam;

import java.util.Scanner;

public class Challenge {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Give John's Interval, A");
	int a = scan.nextInt();
	System.out.println("Give John's Interval, b");
	int b = scan.nextInt();
	System.out.println("Give Bessie's Interval, c");
	int c = scan.nextInt();
	System.out.println("Give Bessie's Interval, d");
	int d = scan.nextInt();

	if(a<b && c<d)
	{
	if(c > b)
	{
		System.out.println(b-a+d-c);
	}
	else if(c<a && d<b)
	{
		System.out.println(b-c);
	}
	else if(c<a && d>b)
	{
		System.out.println(d-c);
	}
	else if(a<c && d>b)
	{
		System.out.println(d-a);
	}
	else if(a<c && b>d)
	{
		System.out.println(b-a);
	}
	else if( a==c && b==d)
	{
		System.out.println(b-a);
	}
	else
	{
		System.out.println(b-a+d-c);
	}
	}
	else
	{
		System.out.println("A can not be greater than B and C can not be greater than D");
	}
}
}
