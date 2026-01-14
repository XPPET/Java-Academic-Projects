import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ship ship1 = new Ship("Zeus", 3);
		Ship ship2 = new Ship("Copacabana", 160);
		Ship ship3 = new Ship("Tinos", 210);
		Ship ship4 = new Ship("Crete", 350);
		
		Bulk bulk1 = new Bulk("CYZ121", "Barcelona", 2500);
		Refridgerator refr1 = new Refridgerator("RRX151", "London", 4.8);
		Bulk bulk2 = new Bulk("YYK223", "Thessaloniki", 3100);
		Refridgerator refr2 = new Refridgerator("RRN310", "Genova", 2.2);
		Bulk bulk3 = new Bulk("CYZ122", "Patras", 2800);
		Refridgerator refr3 = new Refridgerator("RKX251", "London", 4.8);
		Bulk bulk4 = new Bulk("YYK224", "Valencia", 3200);
		Refridgerator refr4 = new Refridgerator("RTN350", "Genova", 2.2);
		
		ship1.addContainer(bulk1);
		ship1.addContainer(refr1);
		ship1.addContainer(bulk2);
		ship2.addContainer(refr2);
		ship3.addContainer(bulk3);
		ship3.addContainer(refr3);
		ship4.addContainer(bulk4);
		ship4.addContainer(refr4);
		
		ArrayList<Ship> shipCollection = new ArrayList<>();
		shipCollection.add(ship1);
		shipCollection.add(ship2);
		shipCollection.add(ship3);
		shipCollection.add(ship4);
		
		new ContainerFrame(shipCollection);
		
		
	}

}
