package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Carrot");
		hs.add("Papaya");
		hs.add("Orange");
		hs.add("Grapes");
		
		System.out.println("HashSet size is: "+hs.size());
		hs.remove("Papaya");
		hs.remove("Green apple");
		System.out.println("Checking the Grapes are there in the list: "+hs.contains("Grapes"));
		
		for(String name: hs) {
			System.out.println("Updated set is: "+name);
	
		}

	}

}
