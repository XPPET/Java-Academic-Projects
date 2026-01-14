
public class Student {
	
	private String name;
	private String id;
	
	public Student(String aName, String someId) {
		name = aName;
		id = someId;
	}
	
	public Student(String aName) {
		name = aName;
		id = "Not defined yet";
	}
	
	public Student() {
		name = "Not defined yet";
		id = "Not defined yet";
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
	}
	
	public void setName(String aName) {
		name = aName;
	}
	
	public String getName() {
		return name;
	}
 
}
