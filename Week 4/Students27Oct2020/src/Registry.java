import java.util.ArrayList;

public class Registry {
	
	private String departmentName;
	private ArrayList<Course> allCourses = new ArrayList<Course>();

	public Registry(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void addCourse(Course aCourse) {
		allCourses.add(aCourse);
	}
	
	public void printAllRecords() {
		System.out.println("Detailed Record for department: " + departmentName);
		System.out.println("The department has the following courses: ");
		for(Course course: allCourses) {
			course.printCourseDetails();
		}
	}


}
