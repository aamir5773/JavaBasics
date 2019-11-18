package com.lti.arraylistdemos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class DemoSet {
	
	public static void main(String[] args) {

		Set mySet= new HashSet();
		
		Book b1= new Book(123,"java");
		Book b2= new Book(123,"java");
		
		mySet(b1);
		
		
		mySet.add(300);
		mySet.add(100);
		mySet.add(200);
		mySet.add(100);
        //mySet.add("Jay");
		//mySet.add("Jay");		
		
		System.out.println(mySet);
		
		Set tset= new TreeSet();
		
		tset.add(3000);
		tset.add(2000);
		tset.add(2500);
		
		System.out.println(tset);
		
		
		
Set<Book> mySet1 = new HashSet();
		
		Book b11 = new Book(1,"JAVA");
		Book b21 = new Book(1,"JAVA");
		mySet1.add(b11);
		mySet1.add(b11);
		mySet1.add(b21);
		
		//System.out.println(b1.hashCode());
		//System.out.println(b2.hashCode());
		
		Iterator<Book> it1 = mySet1.iterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
			//System.out.println(it1.hashCode());
		}
	
	//	System.out.println(mySet);		
}

	private static void mySet(Book b1) {
		// TODO Auto-generated method stub
		
	}
}
