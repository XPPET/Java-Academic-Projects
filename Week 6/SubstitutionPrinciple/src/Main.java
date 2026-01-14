import javax.swing.JOptionPane;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		boolean more = true;
		
		while(more) {
			
			String type = JOptionPane.showInputDialog("What type of account? 1: BankAccount, 2: SavingsAccount, 3: CheckingAccount");
			int selection = Integer.parseInt(type);	
			
			String name = JOptionPane.showInputDialog("Enter owner's name");
	    	String balanceText = JOptionPane.showInputDialog("Enter balance");
	    	double balance = Double.parseDouble(balanceText);
	        
	    	BankAccount account = null;
	    	 
	    	if(selection == 1) {
	        
	        	account = new BankAccount(name, balance);
	        }
	        else if(selection == 2) {
	        	String rateText = JOptionPane.showInputDialog("Enter the interest rate");
	        	double rate = Double.parseDouble(rateText);
	        	account = new SavingsAccount(name, balance, rate);
	        }
	        else if(selection == 3) {
	        	account = new CheckingAccount(name, balance);
	        }
	        else
	        	System.out.println("Your selection is not valid");
	    	
	    	accounts.add(account);
	    	
	    	String answer = JOptionPane.showInputDialog("Another account? (Y/N)");
	    	if(answer.equalsIgnoreCase("N"))
	    		more = false;
	    		
		}
    	
    	//Δυναμική διασύνδεση - καθυστερημένη διασύνδεση - late binding
    	//ΠΟΛΥΜΟΡΦΙΣΜΟΣ - POLYMORPHISM
    	
		for(BankAccount account: accounts)
			account.printInfo();   //πολυμορφική κλήση 
		                           //η printInfo που εκτελείται
			                       //εξαρτάται απο το είδος του λογαριασμού
		                           //προς το οποίο 'δείχνει' η αντίστοιχη θέση της δομής δεδομένων

	}

}
