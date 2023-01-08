package com.upskill.java_4;

public class Encapsulation {

	
		private String name = "upskill";	//write and read
		private int ssn = 5548625;			//write only
		private String username= "Mizu";	//read only

		
	public void setName(String value){			//setter method
		name = value;
	}
		
	public String getName(){
		return name;
	}
	public void setSSN(int value){
		ssn = value;
	}
	public String getUserName(){
			return username;
	}
		
		public static void main(String[] args) {
			Encapsulation obj = new Encapsulation();
			
			obj.setName("downskill");
			System.out.println(obj.getName());
			
		obj.setSSN(548556);
		
		System.out.println(obj.getUserName());
			
		}
			
	}

