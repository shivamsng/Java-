package fourteenSep;

	import java.util.*;  
	public class KeyValueMapping {
	   public static void main(String args[]) {
		   
	  HashMap <Integer,String> Hash_Map = new HashMap <Integer,String> ();
	  Hash_Map.put(1, "Red");
	  Hash_Map.put(2, "Green");
	  Hash_Map.put(3, "Black");
	  Hash_Map.put(4, "White");
	  Hash_Map.put(5, "Blue");
	  
	  // check if map is empty
	  boolean result = Hash_Map.isEmpty();
	  
	  // check the result
	  System.out.println("Is Hash map empty: " + result);
	  
	  // Removing all the elements from the linked map
	  Hash_Map.clear();
	  
	  // check if map is empty
	  result = Hash_Map.isEmpty();
	  
	  
	  // check the result
	  System.out.println("Is Hash map empty: " + result);
	 }
	}