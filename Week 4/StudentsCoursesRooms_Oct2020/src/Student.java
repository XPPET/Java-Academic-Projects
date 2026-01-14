import java.util.ArrayList;

public class Student {
	
	private String name;
	private String id;
	//ιδιότητα που να συσχετίζει τον φοιτητή με το μάθημα που παρακολουθεί
	//αναφορά τύπου Course
	//δηλαδή το myCourse μπορεί να 'δείξει' σε αντικείμενο τύπου Μάθημα
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public Student(String aName, String someId) {
		name = aName;
		id = someId;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		
		for(int i=0; i<courses.size(); i++) {
			courses.get(i).printCourseDetails();		
		}
		
		System.out.println("--------------");
	}
	
	public void addCourse(Course aCourse) {
		
		if(aCourse.existsSpace()) {
		   courses.add(aCourse);
		   aCourse.addStudent(this);
		   System.out.println("Student has been successfully enrolled in the course");
		}
		else {
			System.out.println("Sorry, the course is full");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
