package im;


public class Student {
private int gpa;
private int id;
private String FirstName;

	public Student(int gpa, int id, String FirstName)
	{
		this.gpa = gpa;
		this.id = id;
		this.FirstName = FirstName;
	}
	public int getGpa()
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
