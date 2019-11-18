package com.lti.person;

public class Person {
	
	
	private String firstName;
	private String lastName;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
















	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
















	public String getLastName() {
		return lastName;
	}
















	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Person(String firstName, String lastName) {
		super();

		if (firstName == null && lastName == null) {
			throw new IllegalArgumentException("Both Names Cannot be NULL");
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public Person() {
		super();
	}


	public String getFullName() {
		String first = 	(this.firstName != null) ? 	this.firstName : "?";
		String last = (this.lastName != null)? this.lastName : "?";
		return first + " " + last;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	


}
