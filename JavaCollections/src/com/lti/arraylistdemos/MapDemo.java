package com.lti.arraylistdemos;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
	
	
	//value - duplicate
	 Map<String,String> mailIds = new HashMap<String,String>(); 	        
	 mailIds.put("user1@gmail.com", "password1"); 
	 mailIds.put("user2@gmail.com", "password1"); 
	 mailIds.put("user1@gmail.com", "password3"); 
	 
	//we cannot iterate a Map directly using iterators,
	//because Map are not Collection
		
	 for (Map.Entry<String, String> entry : mailIds.entrySet())  
    {
       	
      System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
		
       }


	}
}
