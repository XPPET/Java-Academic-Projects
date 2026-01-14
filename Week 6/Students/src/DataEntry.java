import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DataEntry {
	
	public static void readData(ArrayList<Student> students) {
		
		boolean more = true;
		
		while(more) {
			
			String type = JOptionPane.showInputDialog("Enter type of student- 1: student, 2: graduate, 3: phd");
			//μετατρέπουμε το αλφαριθμητικό σε ακέραιο
			int selection = Integer.parseInt(type);
						
			//Είσοδος δεδομένων
			String name = JOptionPane.showInputDialog("Enter name");
			String id = JOptionPane.showInputDialog("Enter id");
			
			String supervisor = null;
			if(selection == 2) 
				supervisor = JOptionPane.showInputDialog("Enter supervisor");
			
			String thesis = null;
			if(selection == 3) {
				thesis = JOptionPane.showInputDialog("Enter thesis");
			}
			
			//Δημιουργία αντικειμένου φοιτητή
			//αρχή της υποκατάστασης
			Student s = null;
			if(selection == 1)
				s = new Student(name, id);
			else if(selection == 2)
				s = new GraduateStudent(name, id, supervisor);
			else if(selection == 3)
				s = new PhDStudent(name, id, thesis);
			
			students.add(s);
			
			String answer = JOptionPane.showInputDialog("Another student (y/n)");
			if(answer.equalsIgnoreCase("n"))
				more = false;
		}
		
	}

}
