package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		car(4, "BMW");
		
	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int Bonus = 10000;
		int RentalIncome = 10000;
		int SideIncome = 20000;
		int newIncome = calculateAnnualIncome+Bonus+RentalIncome+SideIncome;
		System.out.println("My Annual Income = " + newIncome);
	}
	
	
	
	public static void car(){

			System.out.println("My car is Audi !");
	}
	public static void car(int door){
		
		System.out.println("My car is Audi !, is has door: " + door);

	}

	public static void car(String color){
		
		System.out.println("My car is Audi !, is has color: " + color);
	}
	public static void car(int wheel, String brand){
		
		System.out.println("My car is "+ brand +" !, is has wheel: "+ wheel);
	}
}
