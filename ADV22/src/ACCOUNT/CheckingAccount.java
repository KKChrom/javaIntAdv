package ACCOUNT;

public class CheckingAccount extends Account{
public static int min_balance = 100;
	public CheckingAccount(int pin, double balance) {
		super(pin, balance);
		
	}
	@Override
	public void deposit(int val) {
		setBalance(getBalance() + val);
		
	}
	@Override
	public double checkBalance() {
		return getBalance();
		
	}

}
