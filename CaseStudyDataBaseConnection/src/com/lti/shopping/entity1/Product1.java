package com.lti.shopping.entity1;

public class Product1 {
	
	int prdid;
	String prdName;
	float prdCost;
	
	public Product1(int prdid, String prdName, double d) {
		super();
		this.prdid = prdid;
		this.prdName = prdName;
		this.prdCost = (float) d;
	}

	public Product1() {
		super();
	}

	public int getPrdid() {
		return prdid;
	}

	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public float getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}

	@Override
	public String toString() {
		return "Product1 [prdid=" + prdid + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}
	
	
	
	

}
