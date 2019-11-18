package com.lti.person;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class TestPerson {
	
	@Test
	public void GetFirstName()
	{
		Person p =new Person("Robert","King");
		assertEquals(p.getFirstName(),"Robert");
	}
	
	
	   @Test (expected=IllegalArgumentException.class)
		public void testNullsInName()
		{
			System.out.println("from TestPersonException testing exceptions");
			Person per1 = new Person(null,null);		
		}	

}
