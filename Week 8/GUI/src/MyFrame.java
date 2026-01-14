import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	//Βήμα 1. Δημιουργία υποδοχέα
	private JPanel panel = new JPanel();
	
	//Βήμα 2. Δημιουργία γραφικών συστατικών
	private JTextField nameField = new JTextField("Enter name");
	private JTextField idField = new JTextField("Enter id");
	private JTextField courseField = new JTextField("Enter course name");
		
	private JButton enrollButton = new JButton("Enroll Student");
	private JButton printCourseDetailsButton = new JButton("Print Course Details");
	
	private ArrayList<Course> courses = new ArrayList<>();
	
	public MyFrame() {	
		
		courses.add(new Course("Java"));
		courses.add(new Course("Math"));
		courses.add(new Course("Economics"));
		courses.add(new Course("Python"));
		
		//Βήμα 3. Προσθήκη γραφ. συστατικών στο panel
		panel.add(nameField);
		panel.add(idField);
		panel.add(courseField);
		panel.add(enrollButton);
		panel.add(printCourseDetailsButton);
		
		//Βήμα 4. Προσαρμογή panel στο παράθυρο
		this.setContentPane(panel);
		
		EnrollButtonListener buttonListener = new EnrollButtonListener();
		enrollButton.addActionListener(buttonListener);
		
		PrintButtonListener printListener = new PrintButtonListener();
		printCourseDetailsButton.addActionListener(printListener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Event Handling");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class EnrollButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String name = nameField.getText();
			String id = idField.getText();
			
			Student s = new Student(name, id);
			
			String courseTitle = courseField.getText();
			
			Course selectedCourse = null;
			
			for(Course course: courses)
				if(course.getTitle().equals(courseTitle))
					selectedCourse = course;
			
			selectedCourse.enrollStudent(s);
			System.out.println("Student has been enrolled in " + courseTitle);
			
		}
		
	}
	
	class PrintButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			String courseTitle = courseField.getText();
			
			Course selectedCourse = null;
			
			for(Course course: courses)
				if(course.getTitle().equals(courseTitle))
					selectedCourse = course;
			
			selectedCourse.printCourseDetails();
		}
		
	}
}


