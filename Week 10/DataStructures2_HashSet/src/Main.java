import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("John");
		set.add("Mary");
		set.add("Helen");
		set.add("John");
		
		for(String name: set)
			System.out.println(name);
		
	}

}
