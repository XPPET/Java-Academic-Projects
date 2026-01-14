
public class BankAccount implements Measurable {
	
	private double balance;
	
	public BankAccount(double amount) {
		balance = amount;
	}
	
	public double getMeasure() {
		return balance;
	}

}
