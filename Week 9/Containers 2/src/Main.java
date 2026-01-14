import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ship ship1 = new Ship("Copacabana", 100);
		Ship ship2 = new Ship("Zeus", 150);
		Ship ship3 = new Ship("Rhodes", 225);
		Ship ship4 = new Ship("Titan", 130);
		
		ArrayList<Ship> ships = new ArrayList<>();
		ships.add(ship1);
		ships.add(ship2);
		ships.add(ship3);
		ships.add(ship4);
		
		new ContainerFrame(ships);
		
	}

}
