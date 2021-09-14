package fourteenSep;

	import java.util.*;
	
	public class RemoveAllElements {
	  public static void main(String[] args) {
		  
	   // Create Priority Queue
	           PriorityQueue<String> priorityqueue1 = new PriorityQueue<String>(); 
	           
	   // use add() method to add values in the Priority Queue
	          priorityqueue1.add("Red");
	          priorityqueue1.add("Green");
	          priorityqueue1.add("Black");
	          priorityqueue1.add("White");
	          
	    System.out.println("Original Priority Queue: "+priorityqueue1);
	   
	   // Removing all the elements from the Priority Queue
	    priorityqueue1.clear();
	 
	    System.out.println("New Priority Queue: " + priorityqueue1);
	  } 
	}
