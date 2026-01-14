import java.util.ArrayList;

public class Course {
	
	private String title;
	private ArrayList<Student> enrolledStudents = new ArrayList<>();

	public Course(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void enrollStudent(Student s) {
		enrolledStudents.add(s);
	}
	
	public void printCourseDetails() {
		System.out.println("Course: " + title);
		System.out.println("*****Enrolled Students*****");
		for(Student student: enrolledStudents) {
			System.out.println("Name: " + student.getName());
			System.out.println("Id: " + student.getId());
			System.out.println("-------------");
		}
	}
	
	

}
