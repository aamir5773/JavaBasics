package com.lti.interfacedemos;

public class User {
	public static void main(String[] args) {
		PermEmpImp1 p_emp = new PermEmpImp1();
		
		p_emp.setEmpid(1111);
		p_emp.setBasicsal(10000);
		
		//p_emp.calc();
		
		
		TempEmpImp1 t_emp = new TempEmpImp1();
		
		t_emp.setTempid(2222);
		t_emp.setNoDays(30);
		t_emp.setSalPerDay(500.00f);
		
		//t_emp.calc();
		
		IPerson p;
		
		p=p_emp;
		p.calc();
		
		p=t_emp;
		p.calc();
	}

}
