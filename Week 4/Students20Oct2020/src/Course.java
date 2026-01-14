
public class Course {
	
	private String name;
	private int ects;
	private Student myStudent;
	
	public Course(String name, int eCTS) {
		this.name = name;
		ects = eCTS;
	}
	

	public void setStudent(Student myStudent) {
		this.myStudent = myStudent;
	}

	public String getName() {
		return name;
	}
	
	public void printCourseDetails() {
		System.out.println("Course name: " + name);
		System.out.println("ECTS: " + ects);
	}
	
	

}
