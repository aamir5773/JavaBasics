package com.lti.hr.entity;

public class PermEmp extends Person {
	
	int basicSal;

	public PermEmp(int basicSal) {
		super();
		this.basicSal = basicSal;
	}

	@Override
	public String toString() {
		
		return "PermEmp :" +id+" " + name + " " + basicSal;
	}

	public PermEmp() {
		super();
	}
	
	public void calcSal()
	{
		int tSal = baiscSal+5000;
		
	}

	public void setBasicSal(int basicSal) {
	this.basicSal = basicSal;
	}

	
	
	

}
