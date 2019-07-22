package chal;

public class Dealer {
public double mp;
public double cashin;
public Dealer(double mp, double cashin)
{
	this.mp = mp;
	this.cashin = cashin;
	}
public Dealer(int mp, double cashin)
{
	this.mp = mp;
	this.cashin = cashin;
	}
public Dealer(int mp, int cashin)
{
	this.mp = mp;
	this.cashin = cashin;
	}
public Dealer(double mp, int cashin)
{
	this.mp = mp;
	this.cashin  = cashin;
	}
public double deal()
{
	return mp*cashin;
	}

}
