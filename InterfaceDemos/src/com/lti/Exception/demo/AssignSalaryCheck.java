package com.lti.Exception.demo;


public class AssignSalaryCheck {

	public static void main(String ar[])
	{
		String empName = "jay";
		int basicSal = 1500, TA = 2000, HRA = 5000, Tax;// take values from user using scanner
		
		try {
			float TotalSal = FindTotalSal(empName, TA, HRA, basicSal);
			System.out.println("Hello " + empName+ " t your Gross Sal : " + TotalSal);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

	public static float FindTotalSal(String empName, int ta, int hra, int basicSal) throws MyException {
		if (basicSal < 10000)
			throw new MyException();// new object of your own class is being thrown
		else {
			float a = (basicSal * 10) / 100;
			float TSal = basicSal + ta + hra - a;
			return TSal;
		}
	}
}

// user defined or own exception class MyExp /UserExp
class MyException extends Exception {
	public String getMessage() {
		return "Please check salary is less than 10000";
	}
}
