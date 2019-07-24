package ACCOUNT;

public abstract class Account {
private int pin;
private double balance;
public Account(int pin, double balance) {
this.pin = pin;
this.balance = balance;
} 
public abstract void deposit(int val);
public abstract  double checkBalance();
public void setPin(int pin)
{
	this.pin = pin;
	}
public int getPin()
{
	return pin;
	}
public double getBalance()
{
	return balance;
}
public void setBalance(double balance)
{
	this.balance = balance;
	}

}
