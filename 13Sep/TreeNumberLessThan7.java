package array;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeNumberLessThan7 {
	public static void main(String args[]) {
		
	TreeSet<Integer> number=new TreeSet<Integer>();
	number.add(8);
	number.add(5);
	number.add(9);
	number.add(6);
	number.add(4);
	
	System.out.println("Tresset "+number);
	
	TreeSet number1 = (TreeSet)number.headSet(7);
	Iterator iterator;
	iterator = number1.iterator();
	
	System.out.println("number less than 7");
	
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
		
	

}
}