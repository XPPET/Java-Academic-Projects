
public class Student {
	
	private String name;
	private String id;
	private Course myCourse;  //αναφορά προς Μάθημα
	
	public Student(String text1, String text2) {
		name = text1;
		id = text2;
	}
	
	public Student(String text1) {
		name = text1;
		id = "9999";
	}
	
	public void setMyCourse(Course c) {
		myCourse = c;
	}
	
	public String getName() {
		return name;
	}
	
	public String getID() {
		return id;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("AM: " + id);
		System.out.println("Course: " + myCourse.getName());
		System.out.println("Credits: " + myCourse.getCredits());
	}

}
