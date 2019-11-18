package com.lti.interfacedemos;

public class PermEmpImp1 implements IPerson {
	
	int empid;
	double basicsal;

	

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getBasicsal() {
		return basicsal;
	}

	public void setBasicsal(double basicsal) {
		this.basicsal = basicsal;
	}

	@Override
	public String toString() {
		return "PermEmpImp1 [empid=" + empid + ", basicsal=" + basicsal + "]";
	}
	
	@Override
	public void calc() {
		double tsal = basicsal+5000;
		System.out.println(tsal);
		
	}
	
}

