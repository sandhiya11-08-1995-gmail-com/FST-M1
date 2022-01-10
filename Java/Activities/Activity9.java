package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Carrot");
		myList.add("Papaya");
		myList.add("Grapes");
		
		for (String name: myList) {
			System.out.println("Print my List: " +name);
		}

		System.out.println("Get 3rd Value from the List: "+myList.get(2));
		System.out.println("Checking Apple is in the list or not: "+myList.contains("Apple"));
		System.out.println("List size is: "+myList.size());
		
		myList.remove("Banana");
		
		System.out.println("New list size is: "+myList.size());
		
	}

}
