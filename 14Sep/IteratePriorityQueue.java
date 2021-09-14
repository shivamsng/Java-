package fourteenSep;

	import java.util.PriorityQueue;
	public class IteratePriorityQueue {
	  public static void main(String[] args) {
		  
	    PriorityQueue<String> priorityqueue = new PriorityQueue<String>();  
	    priorityqueue.add("Red");
	    priorityqueue.add("Green");
	    priorityqueue.add("Orange");
	    priorityqueue.add("White");
	    priorityqueue.add("Black");
	  
	  System.out.println("Elements of the Priority Queue: ");
	  
	  // iterate the Priority Queue
	  for (String element : priorityqueue) {
		  
	    System.out.println(element);
	    
	    }
	 }
	}
