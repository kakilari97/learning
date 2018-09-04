package com.capg1;

import java.util.LinkedList;
import java.util.List;

public class LLDemo {
	public static void main(String args[]) {
		// create an array list
		List<String> al = new LinkedList<String>();
		System.out.println("Initial size of al: " + al.size());

		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		al.add("B");

		System.out.println("Size of al after additions: " + al.size());

		// display the array list
		System.out.println("Contents of al: " + al);

		// Remove elements from the array list
		//al.remove("F");
		//al.remove(2);

		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
	}
}
