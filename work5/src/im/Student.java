package im;


public class Student {
private double gpa;
private int id;
private String FirstName;

	public Student(double gpa2, int id, String FirstName)
	{
		this.gpa = gpa2;
		this.id = id;
		this.FirstName = FirstName;
	}
	public double getGpa()
	{
		return gpa;
	}
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return FirstName;
	}
}
