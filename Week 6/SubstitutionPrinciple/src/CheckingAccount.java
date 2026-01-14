
public class CheckingAccount extends BankAccount {
	
	private static final double PENALTY = 0.5;
	
	private int transCounter;

	public CheckingAccount(String name, double balance) {
		super(name, balance);
		transCounter = 0;
	}
	
	public void deposit(double amount) {
		transCounter++;
		
		super.deposit(amount);
		
		if(transCounter > 3)
			balance = balance - PENALTY;
	}
	
	//επικάλυψη της printInfo
	public void printInfo() {
		System.out.println("This is a Checking Account");
		super.printInfo();
		System.out.println("Penalty is: " + PENALTY);
		System.out.println("-------------------------");
	}

}
