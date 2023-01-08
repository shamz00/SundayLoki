package com.upskill.java_1;

public class AccessModifier {

	public String name = "Mizu";                  // any class can access
	
	private        int age = 25;			   	 // only same class can access
			
	protected	  int ssn  = 1236548;			  // classes in the same package and subclass
			
            String address = "Heritage Tower";    //default - 67 classes in same package can access
	}
