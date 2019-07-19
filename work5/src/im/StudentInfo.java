package im;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;


public class StudentInfo {
public static void main(String[] args) {
	ArrayList<Student> studentList = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	Boolean flag = true;
	Comparator c = Collections.reverseOrder();

	while(flag)
	{
		System.out.println("Would you like to add a student? (Yes/No)");
		String st = scan.next();
		if(st.toLowerCase().equals("yes"))
		{
			System.out.println("Give gpa");
			int gpa = scan.nextInt();
			System.out.println("Give ID");
			int ID = scan.nextInt();
			System.out.println("Give First Name");
			String fn = scan.next();
			Student s = new Student(gpa, ID, fn);
			studentList.add(s);
			
		
		}
		else
		{
			System.out.println("Ok.");
			flag = false;
		}
	}
	
}
public void bubSort(ArrayList<Student> studentList)
{
	int n = studentList.size();
			for (int i = 0; i < n-1; i++) {
				for (int j = 0; j < n-i-1; j++) {
					if(studentList.get(j+1).getGpa() < studentList.get(j).getGpa())
					{
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(j+1));
					studentList.set(j+1, temp);
				}
			}
			}
}
}
