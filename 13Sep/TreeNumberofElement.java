package array;

import java.util.TreeSet;

public class TreeNumberofElement {
	public static void main(String args[]) {
		
		TreeSet<String> color= new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");
		
		System.out.println("color "+color);
		
		System.out.println(color.size());//number of element
}
}