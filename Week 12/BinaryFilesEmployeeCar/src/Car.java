import java.io.Serializable;


public class Car implements Serializable {
	
	private String brand;

	public String getBrand() {
		return brand;
	}

	public Car(String brand) {
		this.brand = brand;
	}
	
	

}
