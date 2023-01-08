package com.upskill.java_1;

public class Variables {

		//Variables in Java
		
		public String country = "USA";         //instance or global- variables declared in class level,outside method
		public static String 	region = "America";	//static- variable belongs to class and dont required creating object
		public static void main(String[] args) {    
			String city = "New York";  // local- variables declared in method
		}
		public void method(String county){    
		
			String city = "Bloomfield";
		String myCounty = county;            //method parameter - variables used as method parameter
		}
public void test(){		
	String city = "Buffalo";
		}


}
