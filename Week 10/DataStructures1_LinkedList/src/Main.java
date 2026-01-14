import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("John");
		list.add("Mary");
		list.add("Helen");
		list.add("Bob");
		
        /*Iterator<String> iter = list.iterator();
		
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}*/
		
		for(String name: list)
			System.out.println(name);
		
	}

}
