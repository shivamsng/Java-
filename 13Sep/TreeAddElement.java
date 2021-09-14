package array;

import java.util.Set;
import java.util.TreeSet;

public class TreeAddElement {
	public static void main(String args[]) {
		Set<String> color= new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");
		
		System.out.println("color "+color);
		
		Set<String> color1= new TreeSet<String>();
		color1.add("Violet");
		color1.add("Black");
		color.addAll(color1);
		
		System.out.println("after adding "+color);

}
}