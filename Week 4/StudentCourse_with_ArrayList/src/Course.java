import java.util.*;

public class Course {
	
	private String name;
	private ArrayList<Student> enrolledStudents;
	
	public Course(String text) {
		name = text;
		enrolledStudents = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
			enrolledStudents.add(s);
	}
	
	public void printStudentsInfo() {
		for(int i=0; i<enrolledStudents.size(); i++) {
			enrolledStudents.get(i).printInfo();
		}
	}
	
	public String getName() {
		return name;
	}

}
