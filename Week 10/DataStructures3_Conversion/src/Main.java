import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		Collection<String> inputs = new ArrayList<String>();
		
		inputs.add("John");
		inputs.add("Mary");
		inputs.add("Helen");
		inputs.add("John");
		
		System.out.println("----Original arraylist-----");
		for(String name: inputs)
			System.out.println(name);
		
		Collection<String> noDuplicates = new HashSet<String>(inputs);
		
		System.out.println("----NoDuplicates Set-----");
		for(String name: noDuplicates)
			System.out.println(name);
		
	}

}
