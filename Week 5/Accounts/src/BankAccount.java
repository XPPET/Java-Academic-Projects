
public class BankAccount {
	
	protected String name;
	protected double balance;
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
    public void printInfo() {
    	System.out.println("Name: " + name);
    	System.out.println("Balance: " + balance);
    }
}
