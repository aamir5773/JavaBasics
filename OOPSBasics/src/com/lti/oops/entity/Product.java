package com.lti.oops.entity;

public class Product {


		
		public int barcode;
		public String productname;
		public float productcost;
		public String cname;
		
		public void calbill(int quantity)
		{
			int quant=quantity;
			float bill= quantity*this.productcost;
			System.out.println(bill);
			}
			
			
		@Override
		public String toString() {
			return "Product [barcode=" + barcode + ", productname=" + productname + ", productcost=" + productcost
					+ ", cname=" + cname + "]";
		}


		


		public Product(int barcode, String productname, float productcost) {
			super();
			this.barcode = barcode;
			this.productname = productname;
			this.productcost = productcost;
			this.cname="Buffalo";
		}


		public Product() {
			super();
			this.cname="Buffalo";
		}


		public int getBarcode() {
			return barcode;
		}


		public void setBarcode(int barcode) {
			this.barcode = barcode;
		}


		public String getProductname() {
			return productname;
		}


		public void setProductname(String productname) {
			this.productname = productname;
		}


		public float getProductcost() {
			return productcost;
		}


		public void setProductcost(float productcost) {
			this.productcost = productcost;
		}
		
		
		
		
		
		
		
	}


