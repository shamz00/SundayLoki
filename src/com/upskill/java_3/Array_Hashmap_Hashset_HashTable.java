package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//array store multiple data using index
		
		int age = 30;											//variable
		int[] ageLoki =  new int[]{25, 30, 35, 38, 40};          //array
		
		//array index              [0] [1] [2] [3] [4]
		
		System.out.println("Student Age : " + ageLoki[2]);
		System.out.println("Total Student : " + ageLoki.length);
		
		String[] nameLoki = new String[]{"Arif", "Marzan", "Badshah", "Mizu", "Kader", "Joy"};
		//array index			 		 [0]      [1]		 [2]		[3]		[4]		[5]
		
		System.out.println("Student Name : " + nameLoki[5]);
		System.out.println("Total Student : " + nameLoki.length);
		
	//multi-dimentional array
	
	int [][] ageLoki2D = {{25, 30, 35, 38, 40},      // [0][0] [0][1] [0][2] [0][3] [0][4]
						 {25, 30, 35, 51}};				//  [1][0] [1][1] [1][2] [1][3] [1][4]
	
	System.out.println("Student Age 2D : " + ageLoki2D[1][3]);
	
	//hashmap store data in key value pair 
	
	HashMap<String, Integer> Student = new HashMap<String, Integer>();
	
	Student.put("Anik", 25);
	Student.put("Arif", 30);
	Student.put("Badshah", 35);
	
	System.out.println("HashMap Student Age : " + Student.get("Arif"));
	
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	
	Capital.put("USA", "Washinton");
	Capital.put("Bangladesh", "Dhaka");
	Capital.put("India", "Delhi");
	
	System.out.println("Capital City : " + Capital.get("USA"));
	
	//hashset
	
	HashSet<String> car = new HashSet<String>();
	car.add("BMW");
	car.add("Audi");
	car.add("Ford");
	
	System.out.println("Car : " + car);
	
	Hashtable<String, String> Region = new Hashtable<String, String>();
	Region.put("BD", "Asia");
	Region.put("USA","America");
	
	System.out.println("Region: " + Region.get("BD"));
			
	}
}
