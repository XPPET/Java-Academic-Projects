import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
		Collection<String> set1 = new HashSet<String>();
		
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		
		Collection<String> set2 = new HashSet<String>();
		
		set2.add("D");
		set2.add("E");
		set2.add("F");
		
		//returns true if s2 is a subset of s1
		if(set1.containsAll(set2))
			System.out.println("set2 is a subset of s1");
		else
			System.out.println("set2 is NOT a subset of s1");
		
		//transform set1 into the union of set1 and set2
		set1.addAll(set2);
		System.out.println("---Union----");
		System.out.println(set1);
		
		//transform set1 into the intersection of set1 and set2
		set1.retainAll(set2);
		System.out.println("---InterSection----");
		System.out.println(set1);
		
		//transform set1 into the set difference of set1 and set2
		//the difference of set1\set2 is the set containing
		//all of the elements in set1 but not in set2
		System.out.println("---Set Difference----");
		set1.add("X");
		System.out.println(set1);
		System.out.println(set2);
		set1.removeAll(set2);
		System.out.println(set1);
	}

}





