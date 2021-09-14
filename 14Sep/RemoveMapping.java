package fourteenSep;

		import java.util.*;
		
	    public class RemoveMapping { 
		   public static void main(String args[]) {
			   
		  HashMap <Integer,String> Hash_map = new HashMap <Integer,String> ();
		  Hash_map.put(1, "Red");
		  Hash_map.put(2, "Green");
		  Hash_map.put(3, "Black");
		  Hash_map.put(4, "White");
		  Hash_map.put(5, "Blue");
		  
		  // print the map
		  System.out.println("The Original linked map: " + Hash_map);
		  
		  // Removing all the elements from the linked map
		  Hash_map.clear();
		  System.out.println("The New map: " + Hash_map);
		 }
		}
