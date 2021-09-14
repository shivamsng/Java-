package array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTree {
	public static void main(String args[]) {
		
		HashSet<String> str=new HashSet<String>();
		str.add("Shivam");
		str.add("Yash");
		str.add("Pankaj");
		str.add("Prakhar");
		
		System.out.println("Hashset "+str);
		
		Set<String> str1=new TreeSet<String>(str);
		System.out.println("Tree:");
		
		for(String element:str1) {
			System.out.println(element);
		}

}
}