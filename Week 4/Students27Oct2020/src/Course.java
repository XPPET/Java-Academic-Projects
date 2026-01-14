import java.util.ArrayList;

public class Course {
	
	private String name;
	private int ects;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Classroom room;
	
	public Course(String name, int eCTS) {
		this.name = name;
		ects = eCTS;
	}
	
	public void setClassroom(Classroom aRoom) {
		room = aRoom;
	}
	
	public void enroll(Student aStudent) {
		students.add(aStudent);
	}
	
	public String getName() {
		return name;
	}
	
	public void printCourseDetails() {
		System.out.println("Course name: " + name);
		System.out.println("ECTS: " + ects);
		room.printLocation();
		for(Student student: students)
		    student.printInfo();
	}
	
	public void printEnrolledStudents() {
		System.out.println("Course: " + name + " has the following students");
		for(int i=0; i<students.size(); i++)
			System.out.println(students.get(i).getName());
	}
	
	public boolean isFull() {
		
		if(students.size() < room.getCapacity())
			return false;
		else
			return true;
		
	}
}
