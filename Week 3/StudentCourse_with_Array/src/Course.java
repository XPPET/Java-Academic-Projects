
public class Course {
	
	private String name;
	private Student[] enrolledStudents;
	private int counter;
	
	public Course(String text) {
		name = text;
		enrolledStudents = new Student[20];
		counter = 0;
	}
	
	public void addStudent(Student s) {
		if(counter < 20) {
			enrolledStudents[counter] = s;
			counter++;
		}	
	}
	
	public void printStudentsInfo() {
		for(int i=0; i<counter; i++) {
			enrolledStudents[i].printInfo();
		}
	}

}
