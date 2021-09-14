package array;

import java.util.LinkedList;

public class AppendElementLinkedList {
	public static void main(String args[]) {
		
		LinkedList<String> llist=new LinkedList<String>();
		llist.add("Shivam");
		llist.add("Pankaj");
		llist.add("Prakhar");
		
		System.out.println("linked list "+llist);
		
		llist.addLast("Yatharth");
		System.out.println("After append "+llist );
	}

}