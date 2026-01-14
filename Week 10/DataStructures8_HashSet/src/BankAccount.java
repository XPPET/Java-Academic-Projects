
public class BankAccount {
	
	private double balance;
	private String code;
	
	public BankAccount(double balance, String code) {
		this.balance = balance;
		this.code = code;
	}

	public double getBalance() {
		return balance;
	}

	public String getCode() {
		return code;
	}
	
	public int hashCode() {
		return code.hashCode();
	}
	
	public boolean equals(Object other) {
		BankAccount otherAccount = (BankAccount)other;
		if(this.code.equals(otherAccount.code))
			return true;
		else
			return false;
	}
}
