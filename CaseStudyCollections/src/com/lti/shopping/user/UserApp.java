package com.lti.shopping.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lti.shopping.entity.Product;
import com.lti.shopping.services.IProduct;
import com.lti.shopping.services.ImplProduct;

public class UserApp {

	public static void main(String[] args) {

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
			case 1: Product P= new Product(101,"Mobile",5000);
					IProduct service = new ImplProduct();
					service.addProduct(P);
					List<Product> prdList = new ArrayList<>();
					prdList = service.addProduct(P);
					System.out.println(P);
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
