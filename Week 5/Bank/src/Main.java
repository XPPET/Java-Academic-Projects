
public class Main {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Nikolaou", 1500);
		
		ba.printData();
		
		SavingsAccount sa = new SavingsAccount("Christou", 1200, 0.02);
		
		sa.addInterest();
		sa.printData();
		
		CheckingAccount ca = new CheckingAccount("Andreou", 1000);
		ca.deposit(100);
		ca.deposit(100);
		ca.deposit(100);
		ca.deposit(100);
		ca.printData();

	}

}
