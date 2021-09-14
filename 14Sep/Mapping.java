package fourteenSep;

	import java.util.*;  
	public class Mapping { 
	   public static void main(String args[]) {
		   
	  // Create two Hash Maps
	  HashMap <Integer,String> Hash_map1 = new HashMap <Integer,String> ();
	  HashMap <Integer,String> Hash_map2 = new HashMap <Integer,String> ();
	  
	 //Put value in Hash_map
	  Hash_map1.put(1, "Red");
	  Hash_map1.put(2, "Green");
	  Hash_map1.put(3, "Black");
	  
	  System.out.println("\nValues in first map: " + Hash_map1);
	  
	  Hash_map2.put(4, "White");
	  Hash_map2.put(5, "Blue");
	  Hash_map2.put(6, "Orange");
	  
	  System.out.println("\nValues in second map: " + Hash_map2);

	  // Put all values in Second Map
	  Hash_map1.putAll(Hash_map1);
	  
	  System.out.println("\nNow values in second map: " + Hash_map1);
	 }
	}
