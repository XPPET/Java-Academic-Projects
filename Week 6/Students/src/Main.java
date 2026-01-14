import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		DataEntry.readData(students);
		
		for(Student student: students)
			student.printInfo();

	}

}
