package array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sortPrac {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Give token");
	int t = s.nextInt();
	Random r = new Random();
	int[] arr = new int[t];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = r.nextInt((t+1));
		
	}
	
	sortPrac c = new sortPrac();
	
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	int m = c.binSort(arr, t);
	if(m != -1)
	{
		System.out.println("token "+m+" was found.");
	}
	else
	{
		System.out.println("Token not found.");
	}
//	int m=c.linSort(arr,t);
//if(	m != -1)
//{
//	System.out.println("Token "+m+" was found.");
//}
//else
//{
//	System.out.println("token not found in the array");
//	}
}
public int linSort(int[] arr, int token)
{
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] == token)
		{
			return token;
		}
	}
	return -1;
	}
public int binSort(int[] arr, int token)
{
	int midVal = 0;
	int low = 0;
	int high = arr.length-1;
	
	while(low <=high)
{
		midVal = (high+low)/2;
		if(arr[midVal] == token)
		{
			return token;
		}
		if(token > arr[midVal])
		{
			low = midVal+1;
		}
		if(token < arr[midVal])
		{
			high = midVal-1;
		}
	}
	return -1;
}
}
