package array;


import java.util.TreeSet;

public class TreeFirstAndLastElement {
	public static void main(String args[]) {
		
		TreeSet<String> color = new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");
		
		System.out.println("color " + color);
		
		Object First = color.first(); // fist element
		System.out.println("first " + First);
		
		Object Last = color.last();// last element
		System.out.println("Last " + Last);

	}
}