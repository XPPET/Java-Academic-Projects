
public class Student implements Measurable {
	
	private double gpa;
	
	public Student(double aNumber) {
		gpa = aNumber;
	}
	
	public double getMeasure() {
		return gpa;
	}

}
