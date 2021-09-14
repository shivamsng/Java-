package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UpdateElement {
	public static void main(String args[]) {
		
		List<String> list2=new ArrayList<String>();
		list2.add("Shivam");
		list2.add("Pankaj");
		list2.add("Yash");
		list2.add("Yatharth");
		
		System.out.println("list "+list2);
		
		list2.set(3, "Ritik");
		System.out.println("updated list "+list2);
		
		//search an element in array list
		boolean arr=list2.contains("realme");
		if(arr) {
			
			System.out.println("Yatharth");
		}
		
		else {
			System.out.println("not contain");
			
		}
		
		//reverse element
		Collections.reverse(list2);
		System.out.println("reverse list "+list2);
	}
	
}