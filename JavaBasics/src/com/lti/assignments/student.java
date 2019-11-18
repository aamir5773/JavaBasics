package com.lti.assignments;

import java.util.Scanner;

public class student {
	public static void main(String[] args) {
		
		int s_id,s_marks,s_fees;
		String s_name;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Student Id : ");
		s_id= sc.nextInt();
	
		System.out.println("Enter Student Marks : ");
		s_marks= sc.nextInt();
		

		System.out.println("Enter Student Fees : ");
		s_fees = sc.nextInt();
		
		System.out.println("Enter student name : ");
		s_name= sc.next();
		
		if(s_marks>=80)
			System.out.println("Grade is A");
		
		if(s_marks>=60 && s_marks<=80)
			System.out.println("Grade is B");
		
		if(s_marks>=50 && s_marks<=60)
			System.out.println("Grade is C");
		
		if(s_marks<50)
			System.out.println("Grade is Fail");
		
	}
}
