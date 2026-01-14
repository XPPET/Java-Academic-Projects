
public class Main {

	public static void main(String[] args) {
		
		Registry r1 = new Registry("Applied Informatics");
		
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Python", 3);
		
		r1.addCourse(c1);
		r1.addCourse(c2);
		
		Student s1 = new Student("Mary", "ics23044");
		Student s2 = new Student("John", "iis24012");
		Student s3 = new Student("Bob", "iis25025");
			
		
		Classroom cl1= new Classroom("Ergastirio KYD", 80);
		Classroom cl2 = new Classroom("Small Lab", 2);
		
		c1.setClassroom(cl2);
		c2.setClassroom(cl1);
		
		c1.enrollStudent(s1);
		c1.enrollStudent(s2);
		c2.enrollStudent(s3);
		
		r1.printDepartmentInfo();
		
		
		
	
	}
}
