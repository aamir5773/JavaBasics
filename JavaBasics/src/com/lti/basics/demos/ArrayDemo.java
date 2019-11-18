package com.lti.basics.demos;
import java.util.Scanner;

public class ArrayDemo {  
	
	public static void main(String[] args) {
		int no,sum=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("how many students");
		no=sc.nextInt();
		
		int marks[]= new int[no];
		
		for( int i=0;i<no;i++){
			System.out.println("Enter marks");
			marks[i]=sc.nextInt();
		}
		
		for (int i=0;i<no;i++)
		{
			System.out.println(marks[i]);
		}
		for (int i=0;i<no;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println(sum);
}
}
