package array;

import java.util.TreeSet;

public class TreeCompare {
	public static void main(String args[]) {
		
		TreeSet<String> color= new TreeSet<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Black");
		color.add("Green");
		
		System.out.println("color "+color);
		
		TreeSet<String> color1= new TreeSet<String>();
		color1.add("Grey");
		color1.add("Black");
		
		System.out.println("color2 "+color1);
		
		TreeSet<String> Color=new TreeSet<String>();
		for(String element:color) {
			
			System.out.println(color1.contains(element) ? "Yes" : "No");
		}
	}
}
