package com.lti.arraylistdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Jay",50000.00f);
		Employee e2 = new Employee(102,"Vijay",60000.00f);
		Employee e3 = new Employee(103,"Sanjay",70000.00f);
		
		List myList= new ArrayList();
		//List<Employee> myList= new ArrayList<>();    generics
		
		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
		
		//System.out.println(myList);
		
		
		Book b1= new Book(1111,"Java");
		Book b2= new Book(1112,"Oracle");
		
		myList.add(b1);
		myList.add(b2);
		
		for (Object o:myList)
		{
			System.out.println(o);
		}
		
		
		Iterator it1 = myList.iterator();
		while(it1.hasNext())
		{
			System.out.println( it1.next());
		}
		
		
		//System.out.println(myList);
		
		
		
}

}
