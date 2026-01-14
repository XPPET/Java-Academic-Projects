
//η κλάση SavingsAccount κληρονομεί την BankAccount
public class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	public SavingsAccount(String aName, double amount, double rate){
		//κλήση του κατασκευαστή της υπερκλάσης
		super(aName, amount);
		interestRate = rate;
	}
	
	public void setInterestRate(double amount) {
		interestRate = amount;
	}
	
	public void addInterest() {
		balance = balance + balance * interestRate;
	}

	//επικάλυψη ή επαναορισμός ή υποσκέλιση
	//override
	public void printData() {
		super.printData();
		System.out.println("Interest Rate: " + interestRate);
	}
}
