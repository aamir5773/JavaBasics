package com.lti.hr.user;

import com.lti.hr.entity.PermEmp;
import com.lti.hr.entity.Person;
import com.lti.hr.entity.TempEmp;

public class MyUserApp {

	public static void main(String[] args) {

//		Person p1 = new Person(1000,"ABC");
//		p1.calcSal();
//		System.out.println(p1);
//		
		
		
		PermEmp pe = new PermEmp();
		pe.setId(101);
		pe.setName("Jay");
		pe.setBasicSal(50000);
		
		System.out.println(pe);
		
		
		
		TempEmp te= new TempEmp(102,"Sanjay",10,3000);
		System.out.println(te);
		

		
	}

}
