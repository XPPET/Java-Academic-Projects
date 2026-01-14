import java.util.ArrayList;

public class Course {
	
	private String name;
	private int credits;
	private ArrayList<Student> enrolledStudents = new ArrayList<>();
	private Classroom room;
	
	public Course(String name, int credits) {
		//super();
		this.name = name;
		this.credits = credits;
	}
	
	public void printDetails() {
		System.out.println("Course: " + name);
		System.out.println("ECTS: " + credits);
		System.out.println("is taught at: " + room.getDescription());
		System.out.println("Enrolled Students: ");
		for(int i=0; i<enrolledStudents.size(); i++) 
		   enrolledStudents.get(i).printInfo();
	}
	
	public void enrollStudent(Student aStudent) {
		if(enrolledStudents.size() < room.getCapacity())
		   enrolledStudents.add(aStudent);
		else
		   System.out.println("Sorry the course is full");
	}
	
	public void setClassroom(Classroom aRoom) {
		room = aRoom;
	}

}
