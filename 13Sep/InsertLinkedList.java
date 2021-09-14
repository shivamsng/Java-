package array;

import java.util.LinkedList;

public class InsertLinkedList {
	public static void main(String args[]) {
		LinkedList<String> llist1=new LinkedList<String>();
		llist1.add("Shivam");
		llist1.add("Pankaj");
		llist1.add("Yash");
		llist1.add("Yatharth");
		System.out.println("list "+llist1);
		
		//insert at specified position in linked list
		llist1.add(3, "Prakhar");
		System.out.println("after insert "+llist1);
		
		llist1.addFirst("Ram");//insert at fisrt position in linked list
		System.out.println("insert at fisrt "+llist1);
		
		llist1.addLast("Ritik"); //insert at last position in linked list
		System.out.println("insert at last "+llist1);
	}

}