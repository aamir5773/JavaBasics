package com.lti.arraylistdemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserApp {
	
	public static void main(String[] args) {
		
		Employee e1= new Employee(105,"vijay",4000);
		Employee e2= new Employee(101,"sanjay",9000);
		Employee e3= new Employee(103,"Jay",6000);
		
		List<Employee> myList= new ArrayList<>();
		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
		
		System.out.println("Before Sort");
		for(Employee e:myList){
			System.out.println(e);
		}
		Collections.sort(myList,new EmpSortById());
		System.out.println("After sort by Id");
		for(Employee e :myList){
			System.out.println(e);
		}
		
		Collections.sort(myList,new EmpSortBySal());
		System.out.println("After sort by Sal");
		for(Employee e: myList){
			System.out.println(e);
		}
		
		
	}

}
