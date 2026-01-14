import java.io.Serializable;

public class Employee implements Serializable {
	
	private String name;
	private Car myCar;
	
	public void setCar(Car c) {
		myCar = c;
	}
	
	public Car getCar() {
		return myCar;
	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
