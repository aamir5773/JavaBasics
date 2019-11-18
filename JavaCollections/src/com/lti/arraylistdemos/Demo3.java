package com.lti.arraylistdemos;

import java.util.LinkedList;

public class Demo3 {
	
	public static void main(String[] args) {
		
	
	LinkedList<String> lst = new  LinkedList<>();
	
	lst.add("A");
	lst.add("B");
	lst.add("C");
	lst.add("D");
	lst.add("E");				
	lst.addLast("F");
	lst.addLast("G");			
	lst.add(1, "A2");
	System.out.println("Original contents of lst: " + lst );
	lst.remove("F");
	lst.remove(2);
	System.out.println("Contents of lst after deletion: " + lst);
	lst.removeFirst();
	lst.removeLast();
	System.out.println("lst after deleting first and last: " + lst);
	

}
}
