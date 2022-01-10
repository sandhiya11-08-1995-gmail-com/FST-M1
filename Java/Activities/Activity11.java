package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		HashMap<Integer, String> colours = new HashMap<Integer, String>();
		colours.put(1, "Green");
		colours.put(2, "Yellow");
		colours.put(3, "Blue");
		colours.put(4, "Red");
		colours.put(5, "Pink");

		System.out.println("Hash map values are: "+ colours);
		
		colours.remove(2);
		System.out.println("Updated Hash map values are: "+ colours);
		
		if(colours.containsKey("Green")) {
			System.out.println("Green exist in the map");
		}
		else {
			System.out.println("Green does not exist in the map");
		}

		System.out.println("Hash map size is: "+ colours.size());
	}

}
