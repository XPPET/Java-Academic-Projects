
public class UnderGradStudent extends Student {
	
	private int year;

	public UnderGradStudent(String name, String id, int year) {
		super(name, id);
		this.year = year;
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Year: " + year);		
	}
	
	public void printType() {
		System.out.println("Hello I am an undergraduate");
	}

}
