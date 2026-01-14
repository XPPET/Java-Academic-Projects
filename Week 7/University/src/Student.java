
public abstract class Student {
	
	private String name;
	private String id;
	
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("id: " + id);
	}
	
	public abstract void printType();
	

}
