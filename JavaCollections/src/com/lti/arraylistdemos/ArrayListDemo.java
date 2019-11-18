package com.lti.arraylistdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		List myList = new ArrayList();
		
		myList.add(100);
		myList.add(200);
		myList.add(300);
		myList.add(300);
		myList.add("Jay");
		myList.add(7000.00);
		
		System.out.println(myList);
		
		myList.remove(2);
		
		System.out.println(myList);
		
		myList.add(3,300);
		
		System.out.println(myList);

//		Collections.sort(myList);
//		System.out.println(myList);
		
		myList.remove(3);
		System.out.println(myList);
		
		
	}
	
	

}
