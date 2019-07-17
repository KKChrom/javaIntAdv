package sam;

public class Time {
	int hours;
	int mins;
	int sec;
	Timer timer;
	void setTime(int hours)
	{
		System.out.println(hours);
		System.out.println(this.hours);
	}
	public Timer getTimer() throws NullPointerException
	{
		
		return timer;
		
	}
	Time()
	{
		hours = 2;
		mins=5;
		sec = 10;
	}
	
}
