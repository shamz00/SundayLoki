package com.upskill.java_5;

public class Exeption_TryCatchFinale {

	public static void main(String[] args) {
		
		try{
			
			int[] ageLoki = new int[]{25, 35, 28, 42, 50};
			System.out.println("Student age = " + ageLoki[8]);
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("Array Method Complete ! ");
		}
		
		//Specific Built-in Exceptions - NumberFormatException
		try{
			int num = Integer.parseInt("Test");
		} catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("Number Method Test Complete ! ");
		}
		//user define exceptions
		
		try{
			throw new myException("Test");
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("This is a user define exception method ! ");
		}
		finally { 
			System.out.println("Test Excution Completed");
		}
	}
		
	}	