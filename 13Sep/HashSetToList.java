package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToList {
	public static void main(String args[]) {
		
		HashSet<String> str=new HashSet<String>();
		str.add("Shivam");
		str.add("Yash");
		str.add("Pankaj");
		str.add("Prakhar");
		
		System.out.println("hashset "+str);
		
		List<String> str2=new ArrayList<String>(str);
		System.out.println("List");
		
			System.out.println(str2);
		
		
}
}