package array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeIterate {
	public static void main(String args[]) {
		Set<String> color= new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Green");
		System.out.println("color "+color);
		Iterator itra=color.iterator();
		System.out.println("iterate: ");
		while(itra.hasNext()) {
			System.out.println(itra.next());
		}
}
}