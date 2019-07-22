package im;

import java.util.Random;
import java.util.Stack;
import java.;

public class recursion {
	private int count = 0;
public static void main(String[] args) {
	recursion r = new recursion();
//	Random ra = new Random();
//		System.out.println(r.fibo(ra.nextInt(10)));
//	System.out.println(r.f(6, 8));
	System.out.println(r.result(5));
}
private void hello() {
	// TODO Auto-generated method stub

	System.out.println("h");
	count++;
	if(count<5)
	{
	hello();
}
	
}
public int fibo(int n)
{
	if(n == 0)
	{
		return 0;
	}
	else if(n == 1)
	{
		return 1;
	}
	else
	{
		return fibo(n-1) + fibo(n-2);
	}
	
}
public int f(int k, int n)
{
	if(n==k)
	{
		return k;
	}
	else {
		if(n>k)
		{
			return f(k,n-k);
		}
		else
		{
			return f(k-n,n);
		}
	}
}
public int result(int n)
{
	if(n==1)
	{
		return 2;
	}
	else
	{
		return 2* result(n-1);
	}
	}
}
