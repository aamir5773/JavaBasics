package com.lti.oops.user;

import com.lti.oops.entity.Employee;

public class UserApp {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"Jay",500.00f);
//		Employee e1 = new Employee();
//		e1.setEmpId(101);
//		e1.setEmpName("jay");
//		e1.setEmpSal(1002.25f);
//		
//		e1.empId=101;
//		e1.empName="jay";
//		e1.empSal=5000.00f;
		
		Employee e2 = new Employee();
		e2.empId=102;
		e2.empName="vijay";
		e2.empSal=6000.05f;
//		
//		Employee e3 = new Employee();
//		e3.empId=103;
//		e3.empName="Ram";
//		e.empSal=6000.25f;
		
		
		System.out.println(e1);
		System.out.println(e2);
//		System.out.println(e3);

	}

}
