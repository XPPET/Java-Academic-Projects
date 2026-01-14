
public class Main {

	public static void main(String[] args) {
		
		DataSet ds = new DataSet();
		
		BankAccount ba1 = new BankAccount(1500);
		BankAccount ba2 = new BankAccount(1200);
		BankAccount ba3 = new BankAccount(2100);
		
		Student s1 = new Student(8.9);
		Student s2 = new Student(6.7);
		Student s3 = new Student(9.4);
		
		ds.add(ba1);
		ds.add(ba2);
		ds.add(ba3);
		
		System.out.println("Average is: " + ds.getAverage());
		System.out.println("Maximum is: " + ds.getMaximum().getMeasure());
		System.out.println("Minimum is: " + ds.getMinimum().getMeasure());
	
	}

}
