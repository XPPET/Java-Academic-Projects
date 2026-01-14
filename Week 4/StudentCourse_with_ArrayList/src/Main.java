
public class Main {
	
	public static void main(String[] args) {
		
		Student S1 = new Student("John", "1209");
		Student S2 = new Student("Nick", "1709");
		
		Course C1 = new Course("Math101");
		
		C1.addStudent(S1);
		C1.addStudent(S2);
		
		//C1.printStudentsInfo();
		
		S1.printInfo();
	}
}
