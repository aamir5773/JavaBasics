package com.lti.shopping.dao;

import java.awt.List;
import java.util.ArrayList;

import com.lti.shopping.entity1.Product1;

public interface IDaoProduct {
	
	public abstract void addProduct(Product1 p);
	public abstract List<Product1> getAllProducts();
}
