package com.lti.Exception.demo;

public class Exceptiondemo {

	

//method overriding example 

/*If super class method does not declare any exception, 
 then sub class overriden method cannot declare 
checked exception but it can declare unchecked exceptions.
*/
class SuperClass { 
  
    // SuperClass doesn't declare any exception 
    void method() 
    { 
        System.out.println("SuperClass"); 
    } 
}   
class SubClass extends SuperClass {   
     void method() // throws IOException //throws ArithmeticException //unchecked exp// //checked exp
    { 
          System.out.println("SubClass"); 
    } 
}
public class ExceptionOverride1 {

	public void main(String[] args) {
		
		SuperClass s = new SubClass(); 
        s.method(); 
		
	}
}




}
