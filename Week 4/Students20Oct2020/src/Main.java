
public class Main {

	public static void main(String[] args) {
		
	
		Student s1 = new Student("Sakis", "dai18057");
		
		Course c1 = new Course("Java", 5);
		Course c2 = new Course("Machine Learning", 5);
		
		//καταχώρηση μαθήματος c1 στον φοιτητή s1
		s1.addCourse(c1);
		
		s1.addCourse(c2);
		
		s1.printInfo();
		
		
		
	}

}
