import java.util.ArrayList;

public class Registry {
	
	private String department;
	private ArrayList<Course> courses = new ArrayList<>();
	
	public Registry(String aName) {
		department = aName;
	}
	
	public void addCourse(Course aCourse) {
		courses.add(aCourse);
	}
	
	public void printDepartmentInfo() {
		System.out.println("Department: " + department);
		System.out.println("has the following courses: ");
		for(int i=0; i<courses.size(); i++)
			courses.get(i).printDetails();
	}

}
