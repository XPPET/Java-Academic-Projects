
public class Main {

	public static void main(String[] args) {
		
	
		Student s1 = new Student("Sakis", "dai18057");
		Student s2 = new Student("Babis", "ics19044");
		Student s3 = new Student("Takis", "iis19112");
		
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Machine Learning", 5);
		
		ClassRoom r1 = new ClassRoom("Erg.234", 2);
		ClassRoom r2 = new ClassRoom("Amf13", 3);
		
		c1.setRoom(r1);
		c2.setRoom(r2);
		
		//καταχώρηση μαθήματος c1 στον φοιτητή s1
		s1.addCourse(c1);
		s1.addCourse(c2);
		
		
		s2.addCourse(c1);
		s2.addCourse(c2);
		
		s3.addCourse(c1);
		s3.addCourse(c2);
		
		s1.printInfo();
		
		
		
	}

}
