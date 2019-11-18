package com.lti.oops.user;

import java.util.Scanner;

import com.lti.oops.entity.Product;


public class UserProductApp {
	
	public static void main(String[] args) {
		
		
		

		Product p1 = new Product(101,"White",1022.50f);
		System.out.println(p1);
				
		
		Product p2 = new Product(102,"Black",2022.50f);
		System.out.println(p2);
		
		System.out.println("Enter the quantity for the products you want to purchase");
		Scanner sc= new Scanner(System.in);
	 
		int quantity = sc.nextInt();
		p1.calbill(quantity);
		
		
}

}
