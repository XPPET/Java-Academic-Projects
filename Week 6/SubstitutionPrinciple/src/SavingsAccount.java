
public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingsAccount(String aName, double aBalance, double aRate) {
		super(aName, aBalance);
		interestRate = aRate;
	}
	
	public void addInterest() {
		balance = balance + balance * interestRate;
	}
	
	//επαναορισμό- επικάλυψη- override
	public void printInfo() {
		System.out.println("This is a Savings Account");
		super.printInfo();
		System.out.println("Interest rate: " + interestRate);
		System.out.println("---------------------");
	}

}
