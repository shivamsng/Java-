package fourteenSep;

	import java.util.PriorityQueue;
	public class ComparetwoP_Q {
	  public static void main(String[] args) {
		  
	  // Create a empty Priority Queue
	        PriorityQueue<String> priorityqueue1 = new PriorityQueue<String>(); 
	        
	     // use add() method to add values in the Priority Queue
	        priorityqueue1.add("Red");
	        priorityqueue1.add("Green");
	        priorityqueue1.add("Black");
	        priorityqueue1.add("White");
	          
	          System.out.println("First Priority Queue: "+priorityqueue1);
	          
	          PriorityQueue<String> priorityqueue2 = new PriorityQueue<String>();  
	          priorityqueue2.add("Red");
	          priorityqueue2.add("Pink");
	          priorityqueue2.add("Black");
	          priorityqueue2.add("Orange");
	          
	          System.out.println("Second Priority Queue: "+priorityqueue2);
	          
	          //compare output in Priority Queue
	         for (String element : priorityqueue1){
	        	 System.out.println(priorityqueue2.contains(element) ? "Yes" : "No");	   
	        	 }      
	     }
	}