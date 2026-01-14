
public class CheckingAccount extends BankAccount {
	
	private int transactionsCounter;

	public CheckingAccount(String aName, double amount) {
		super(aName, amount);
		transactionsCounter = 0;
	}
	
	//επικάλυψη της μεθόδου deposit
	public void deposit(double amount) {
		
		super.deposit(amount);
		if(transactionsCounter >= 3)
			balance -= 0.5;
		
		transactionsCounter++;	
	}
	
	

}
