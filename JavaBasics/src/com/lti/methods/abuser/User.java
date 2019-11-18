package com.lti.methods.abuser;

public class User {
	
	public static void main(String[] args) {
		//int result=0;
		Excel sheet1 = new Excel();
		/*sheet1.sum(100, -200);
		System.out.println(result);
		sheet1.sum(400, 500)*/;
		int res= sheet1.sum(10, 20);
		System.out.println("Addition is :" + res);
		
		//Excel sheet2 = new Excel();
	}

}
