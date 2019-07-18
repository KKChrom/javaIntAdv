package bankTing;

public class BankAccount {
	private int pin;
	private double balance;
	private double chargePen;
	public BankAccount(int pin, double balance)
	{
		this.pin = pin;
		this.balance = balance = 0.0;
	}
	public BankAccount()
	{
		chargePen = 20;
	}
	public double getBalance()
	{
		return balance;
	}
	public int getPin()
	{
		System.out.println(pin);
		return pin;
	}
	public int setPin(int newPin) 
	{
		pin = newPin;
		return pin;
		
	}
	public double getPena()
	{
		return chargePen;
	}
	public void deposit(int token,double val )
	{
		if(token == getPin())
		{
				balance+= val;
				double s = balance-val;
				System.out.println("Your balance went from "+s+" to "+balance);
		}
	}
	public void deposit(int token,int val )
	{
		if(token == getPin())
		{
				balance+= val;
				double s = balance-val;
				System.out.println("Your balance went from "+s+" to "+balance);
		}
	}
	public void withdraw(int token,double val)
	{
		if(token == getPin())
		{
			if(val > balance)
			{
				System.out.println("You have been fined "+chargePen+" because you withdrew an amount that exceeded your balance");			double	s = getBalance();
				balance-= val;
				balance-= getPena();
				System.out.println("Your balance went from "+s+" to "+balance);
			}
			else
			{
			double s = balance;
			balance-= val;
			System.out.println("Your balance went from "+s+" to "+balance);
			}
		}
	}
	public void withdraw(int token,int val)
	{
		if(token == getPin())
		{
			if(val > balance)
			{
				System.out.println("You have been fined "+chargePen+" because you withdrew an amount that exceeded your balance");
			double	s = getBalance();
				balance-= val;
				balance-= getPena();
				System.out.println("Your balance went from "+s+" to "+balance);
			}
			double s = balance;
			balance-= val;
			System.out.println("Your balance went from "+s+" to "+balance);
		}
	}
	public double setBalance(int newBal)
	{
balance = newBal;
return balance;

	}
	}

