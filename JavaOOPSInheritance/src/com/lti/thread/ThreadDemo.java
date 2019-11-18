package com.lti.thread;
import java.io.*;
import java.util.Scanner;

public class ThreadDemo extends Thread {

	public ThreadDemo(String str)
		{
		super(str);
		}
		public void run()
		{
				for (int i=0;i<50 ;i++ )
				{
					System.out.println( i + "  " + getName());
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
				}
				System.out.println(" Done " +getName());
		}

		public static void main(String[] args) throws Exception
		{
	        Scanner sc= new Scanner(System.in);
			String s1,s2,s3;		
			System.out.println(" enter three places u want to visit");
			
			System.out.println(" first option");		
			s1= sc.next();
			System.out.println(" second option");		
			s2= sc.next();
			System.out.println(" third option");		
			s3= sc.next();
			
			new ThreadDemo(s1).start();//calls run()
			new ThreadDemo(s2).start();//calls run
			new ThreadDemo(s3).start();//calls run
	}
	}

	
	

