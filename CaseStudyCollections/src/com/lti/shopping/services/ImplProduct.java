package com.lti.shopping.services;

import com.lti.shopping.entity.Product;
import java.util.ArrayList;
import java.util.List;

public class ImplProduct implements IProduct {
	
	List<Product> myList = new ArrayList<>();
	

	@Override
	public List<Product> addProduct(Product p) {
		myList.add(p);
		return myList;
	}
	

}
