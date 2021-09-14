package array;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String args[]) {
		
		HashSet<String> str=new HashSet<String>();
		str.add("Shivam");
		str.add("Pankaj");
		str.add("Yash");
		str.add("Prakhar");
		
		System.out.println("hashset "+str);
		
		String[] newarr= new String[str.size()];
		str.toArray(newarr);
		
		System.out.println("newarrray: ");
		
		for(String element:newarr) {
			System.out.println(element);
		}
	}


}
