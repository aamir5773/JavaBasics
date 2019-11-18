package com.lti.arraylistdemos;

public class Employee1 {
	
	int empid;
	String empname;
	double empsal;
	
	public Employee1(int empid, String empname, double empsal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;
	}

	public Employee1() {
		super();
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	@Override
	public String toString() {
		return "Employee1 [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	
	
	
	
	

}
