
public class BankAccount {
	
	protected double balance;
	protected String name;
	
	public BankAccount(String aName, double amount) {
		name = aName;
		balance = amount;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printData() {
		System.out.println("Account holder: " + name);
		System.out.println("Balance: " + balance);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	//Alt+Shift+S
	//-> Generate Getters and Setters
	//-> Select All
	
}
