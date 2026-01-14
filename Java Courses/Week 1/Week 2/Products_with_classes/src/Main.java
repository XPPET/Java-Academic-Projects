import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Product best = new Product();
		
		boolean flag = true;
		while(flag) {
			
			Product current = new Product();
			
			current.read();   //αποστολή μηνύματος read στο αντικείμενο current
							  //κλήση της μεθόδου read επί του αντικειμένου current
			
			if(current.is_better_than(best))
				best = current;
			
			System.out.println("CONTINUE? (1=YES, 2=NO)");
			int answer = in.nextInt();
			if(answer != 1)
				flag = false;
			in.nextLine();      //flushes the input buffer
		}
		
		System.out.println("Best Product: ");
		best.printData();
	}

}
