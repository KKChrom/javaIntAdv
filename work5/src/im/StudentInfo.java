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
		StudentInfo stu = new StudentInfo();

		while (flag) {
			System.out.println("Would you like to add a student? (Yes/No)");
			String st = scan.next();
			if (st.toLowerCase().equals("yes")) {
				System.out.println("Give gpa");
				double gpa = scan.nextDouble();
				System.out.println("Give ID");
				int ID = scan.nextInt();
				System.out.println("Give First Name");
				String fn = scan.next();
				Student s = new Student(gpa, ID, fn);
				studentList.add(s);

			} else {
				System.out.println("Ok.");
				flag = false;
			}
		}
		System.out.println("Would you like to sort gpa?");
		String gpS = scan.next();
		if (gpS.toLowerCase().equals("yes")) {
			stu.sortGpa(studentList);
			stu.print(studentList);
		}
		else if(gpS.toLowerCase().equals("rev"))
		{System.out.println("REVERSE SORT!");
			stu.reverseSort(studentList);
			stu.print(studentList);
			System.out.println("NORMAL!");
			stu.sortGpa(studentList);
			stu.print(studentList);
		}
		else
		{
			System.out.println("Ok");
		}

	}

	public void sortGpa(ArrayList<Student> studentList) {
		int n = studentList.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (studentList.get(j + 1).getGpa() < studentList.get(j).getGpa()) {
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);

				}

				else if (studentList.get(j + 1).getGpa() == studentList.get(j).getGpa()) {
					if (studentList.get(j + 1).getName().toLowerCase()
							.compareTo(studentList.get(j).getName().toLowerCase()) < 0) {
						Student temp = studentList.get(j);
						studentList.set(j, studentList.get(j + 1));
						studentList.set(j + 1, temp);
					} else if (studentList.get(j + 1).getName().toLowerCase()
							.compareTo(studentList.get(j).getName().toLowerCase()) == 0) {
						if (studentList.get(j + 1).getID() < studentList.get(j).getID()) {
							Student temp = studentList.get(j);
							studentList.set(j, studentList.get(j + 1));
							studentList.set(j + 1, temp);
						}
					}
					// Student temp = studentList.get
				}
			}
		}
	}

	public void reverseSort(ArrayList<Student> studentList) {

		int n = studentList.size();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (studentList.get(j + 1).getName().toLowerCase()
						.compareTo(studentList.get(j).getName().toLowerCase()) < 0)

				{
					Student temp = studentList.get(j);
					studentList.set(j, studentList.get(j + 1));
					studentList.set(j + 1, temp);

				}

				else if (studentList.get(j + 1).getName().toLowerCase()
						.compareTo(studentList.get(j).getName().toLowerCase()) == 0) {
					if (studentList.get(j + 1).getGpa() < studentList.get(j).getGpa()) {
						Student temp = studentList.get(j);
						studentList.set(j, studentList.get(j + 1));
						studentList.set(j + 1, temp);
					} else if (studentList.get(j + 1).getGpa() == studentList.get(j).getGpa()) {
						if (studentList.get(j + 1).getID() < studentList.get(j).getID()) {
							Student temp = studentList.get(j);
							studentList.set(j, studentList.get(j + 1));
							studentList.set(j + 1, temp);
						}
					}
					// Student temp = studentList.get
				}
			}
		}
	}

	public void print(ArrayList<Student> studentList) {
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i).getGpa() + " GPA,  with ID: " + studentList.get(i).getID()
					+ " with First name: " + studentList.get(i).getName());
		}
	}
}
