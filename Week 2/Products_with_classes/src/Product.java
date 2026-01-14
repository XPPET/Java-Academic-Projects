import java.util.Scanner;


public class Product {
	
	private String name;
	private int score;
	private double price;
	
	public Product() {
	   name = "";
	   score = 0;
	   price = 1;
	}
	
	public void read() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter product name: ");
		name = in.nextLine();
		System.out.println("Enter product score: ");
		score = in.nextInt();
		System.out.println("Enter product price: ");
		price = in.nextDouble();
	}
	
	public boolean is_better_than(Product other) {
		if(score/price > other.score/other.price)
			return true;
		return false;
	}
	
	public void printData() {
		System.out.println("Product Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Score: " + score);
	}
	
	

}
