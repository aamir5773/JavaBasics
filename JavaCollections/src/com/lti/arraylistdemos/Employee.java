package com.lti.arraylistdemos;

public class Employee {
	
	int empid;
	String empname;
	float empSal;
	
	@Override
	public String toString() {
		return "\nEmployee [empid= \n" + empid + ", empname=\n" + empname + ", empSal=\n" + empSal + "]";
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

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public Employee(int empid, String empname, float empSal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empSal = empSal;
	}

	public Employee() {
		super();
	}
	
	
	

}
