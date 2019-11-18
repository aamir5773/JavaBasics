package com.lti.oops.user;

import com.lti.oops.entity.Product;

public class Client {

	public static void main(String[] args) {
				
		Product p1 = new Product(102,"White",1022.50f);
		Product p2 = new Product(103,"Black",2022.50f);

//		Product p1 = new Product();
//		p1.setBarcode(1012);
//		p1.setProductcost(1000.50f);
//		p1.setProductname("Shirts");
		
		
		System.out.println(p1);
		System.out.println(p2);

		
	
	
	}
	
}
