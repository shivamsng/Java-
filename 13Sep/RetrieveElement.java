package array;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElement {
	public static void main(String args[]) {
		
		List<String> list1=new ArrayList<String>();
		list1.add("Shivam");
		list1.add("Pankaj");
		list1.add("Yash");
		list1.add("Yatharth");
		
		System.out.println("Index of names "+ list1.indexOf("Yash"));
		
		
	}
}