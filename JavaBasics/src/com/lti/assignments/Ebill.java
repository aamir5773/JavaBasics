package com.lti.assignments;

import java.util.Scanner;

public class Ebill {
	
	public static void main(String[] args) {
		
		//pmr: Previous meter reading 
		//cmr : Current meter reading
		
		int billno, pmr, cmr,units;
		double bill;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please Enter you Bill Number : ");
		billno=s.nextInt();
		
		System.out.println("Please enter Previous Meter Reading");
		pmr= s.nextInt();
		
		System.out.println("Please enter Current Meter Reading");
		cmr= s.nextInt();
		
		units=cmr-pmr;
		System.out.println("Units are " + units);
		
		if(units<=50)
		{
			bill=2*units;
			System.out.println("Bill based on your units is : " + bill);
		}
		
		else 
		{
			bill=(double)3.5*units;
			System.out.println("Bill based on your units is : " + bill);
		}
	}

}
