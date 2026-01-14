
public class Main {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Babis", "ics20155");
		Student s2 = new Student("Maria");
		Student s3 = new Student();
		
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
		s3.setName("Takis");
		s3.printInfo();
		
		System.out.println(s1.getName());
		
	}

}
