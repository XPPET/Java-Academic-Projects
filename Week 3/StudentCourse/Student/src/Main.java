
public class Main {
	
	public static void main(String[] args) {
		Student S1 = new Student("John", "1209");
		Student S2 = new Student("Nick");
		
		//S1.printInfo();  προσοχή, αν κληθεί εδώ η printInfo
		//S2.printInfo();  θα προκληθεί Null Pointer Exception
		
		Course C1 = new Course("Java", 5);
		
		S1.setMyCourse(C1);	//σύνδεση Student S1->Course C1
		S2.setMyCourse(C1);
		
		S2.printInfo();
		S2.printInfo();
	}
}
