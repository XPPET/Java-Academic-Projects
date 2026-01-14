import java.util.ArrayList;

public class Ship {
	
	private String name;
	private int capacity;
	private ArrayList<Container> containers = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public Ship(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	public void addContainer(Container aContainer) {
		if(containers.size() < capacity)
			containers.add(aContainer);
		else
			System.out.println("Sorry the ship is full");
	}
	
	public double calculateTotalCharge() {
		double total = 0;
		for(Container c: containers)
			total += c.calculateCharge();
		
		return total;
	}
	

}
