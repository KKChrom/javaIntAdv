package bankTing;

import java.util.Scanner;

public class Bank {

public static void main(String[] args) {
	int token  = 0;
	Boolean m = false;
	Boolean flag = true;
	BankAccount b = new BankAccount();
	Scanner s = new Scanner(System.in);
	System.out.println("Set pin");
	int pin = s.nextInt();
	b.setPin(pin);
	System.out.println("Would you like to save your pin?("+pin+")");
	if(s.next().toLowerCase().equals("yes"))
	{
	token = pin;

	}
	else
	{
		m = true;
	}
	System.out.println("What would you like to do? (withdraw, deposit, check balance, check pin, save pin, or exit?)");
	String l = s.next();
	while(flag)
	{
		
	if(l.toLowerCase().equals("withdraw"))
	{
		System.out.println("What amount (you could be charged extra.)");
		double val = s.nextDouble();
		if(m)
		{
			System.out.println("Enter token.");
			token = s.nextInt();
		}
		b.withdraw(token, val);
		
	}
	else if(l.toLowerCase().equals("deposit"))
	{
		System.out.println("What amount would you like to deposit");
		double val = s.nextDouble();
		if(m)
		{
			System.out.println("Enter token.");
			token = s.nextInt();
		}
		b.deposit(token, val);
		
	}
	else if(l.toLowerCase().equals("save"))
	{
		System.out.println("Enter token.");
		token = s.nextInt();
		b.setBalance(0);
		System.out.println("Your balance is "+b.getBalance()+" and your pin is "+b.getPin());
		 m = false;
	}
	else if(l.toLowerCase().equals("balance"))
	{
		System.out.println("Your balance is "+b.getBalance());
	}
	else if(l.toLowerCase().equals("pin"))
	{
		System.out.println("Your pin number is "+token);
	}
	else if(l.toLowerCase().equals("exit"))
	{
		flag = false;
		break;
	}
	else
	{
		System.out.println("That is not a valid command!");
	}
	System.out.println("What would you like to do? (withdraw, deposit, check balance, check pin, save pin, or exit?)");
	 l = s.next();
	}
}
}

