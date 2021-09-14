package array;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeReverseElement {
	public static void main(String args[]) {
		
		TreeSet<String> color= new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");
		
		System.out.println("color "+color);
		
		Iterator it= color.descendingIterator();
		System.out.println("reverse treeset:");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
}
}
