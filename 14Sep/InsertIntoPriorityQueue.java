package fourteenSep;

	import java.util.PriorityQueue;

	public class InsertIntoPriorityQueue {
	  public static void main(String[] args) {

	   // Create Priority Queue
	           PriorityQueue<String> priorityqueue1 = new PriorityQueue<String>();  
	           
	   // use add() method to add values in the Priority Queue
	           priorityqueue1.add("Red");
	           priorityqueue1.add("Green");
	           priorityqueue1.add("Black");
	           priorityqueue1.add("White");
	          
	    System.out.println("Priority Queue: "+priorityqueue1);
	   
	   // Inserts the specified element into this priority queue.
	    priorityqueue1.offer("Blue");
	 
	    System.out.println("New Priority Queue: " + priorityqueue1);
	  } 
	}
