package com.lti.shopping.user1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.shopping.dao.IDaoProduct;
import com.lti.shopping.dao.ImplDaoProduct;
import com.lti.shopping.entity1.Product1;



public class UserApp1 {

	public static void main(String[] args) {
		
		IDaoProduct service = new ImplDaoProduct();
		List<Product1> myList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		String ans;
		int no;
		do {
			System.out.println("***** DMART Products Services ****");
			System.out.println("1.Add product ");
			System.out.println("2.Display all product ");
			System.out.println("Pls enter your choice: ");
			no = sc.nextInt();

			switch (no) {
			case 1: System.out.println("Inside Switch CAse 1");
					System.out.println("Enter Details of Product");
					Product1 p1 = new Product1(sc.nextInt(),sc.next(),sc.nextFloat());
					service.addProduct(p1);
					
					break;
			case 2: System.out.println("case 2");
					break;
			default:System.out.println("Enter proper choice");
					break;
			}
			System.out.println("Do you want to continue yes/no");
			ans = sc.next();
		} while (ans.equals("Yes") || ans.equals("y") || ans.equals("yes"));
	}

}
