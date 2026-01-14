import java.util.ArrayList;

public class Course {
	
	private String name;
	private int ects;
	//αναφορά προς αντικείμενο τύπου ClassRoom
	private ClassRoom myRoom;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public boolean existsSpace() {
		if( students.size() < myRoom.getCapacity())
			return true;
		else
			return false;
	}
	
	public void addStudent(Student aStudent) {
		students.add(aStudent);
	}
	
	public Course(String name, int eCTS) {
		this.name = name;
		ects = eCTS;
	}
	
    public void setRoom(ClassRoom aRoom) {
		myRoom = aRoom;
	}
	

//	public void setStudent(Student myStudent) {
//		this.myStudent = myStudent;
//	}

	public String getName() {
		return name;
	}
	
	public void printCourseDetails() {
		System.out.println("Course name: " + name);
		System.out.println("ECTS: " + ects);
	}
	
	

}
