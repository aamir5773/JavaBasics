package com.lti.hr.entity;

public class TempEmp extends Person {
	
	int noDays;
	int perDaySal;
	public TempEmp() {
		super();
		
	}
	public TempEmp(int id, String name,int noDays,int perDaySal) {
		super(id, name);
		
	}
	@Override
	public String toString() {
		return "TempEmp [noDays=" + noDays + ", perDaySal=" + perDaySal + ", id=" + id + ", name=" + name + "]";
	}
	@Override
	public void calcSal() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
