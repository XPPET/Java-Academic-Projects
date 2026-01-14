import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		GraduateStudent gs1 = new GraduateStudent("Maria", "mai21012", "Nikolaou");
		
		UnderGradStudent us1 = new UnderGradStudent("Nick", "iis20144", 2);
		
		students.add(gs1);
		students.add(us1);
		
		for(Student student : students)
			student.printInfo();
		
		for(Student student: students)
			student.printType();
		
		
	

	}

}
