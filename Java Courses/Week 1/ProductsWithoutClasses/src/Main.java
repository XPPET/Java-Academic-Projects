import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String best_name = "";
		double best_price = 1;
		int best_score = 0;
		
		boolean more = true;
		while(more) {
			
			String next_name;
			double next_price;
			int next_score;
		
			System.out.println("Please enter the product name: ");
			next_name = in.nextLine();
			System.out.println("Please enter the product price: ");
			next_price = in.nextDouble();
			System.out.println("Please enter the product score: ");
			next_score = in.nextInt();
			
			if(next_score/next_price > best_score/best_price) {
				best_name = next_name;
				best_price = next_price;
				best_score = next_score;
			}
			
			System.out.println("More data ? (1=YES, 2=NO)");
			int answer = in.nextInt();
			if(answer != 1)
				more = false;
			in.nextLine();
			
		}
		
		System.out.println("The best product is: " + best_name);
		System.out.println("The best price is: " + best_price);
		System.out.println("The best score is: " + best_score);
		

	}

}
