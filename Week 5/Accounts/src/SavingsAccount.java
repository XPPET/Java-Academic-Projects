
public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingsAccount(String aName, double aBalance, double aRate) {
		super(aName, aBalance);
		interestRate = aRate;
	}
	
	public void addInterest() {
		balance = balance + balance * interestRate;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Interest rate: " + interestRate);
	}

}
