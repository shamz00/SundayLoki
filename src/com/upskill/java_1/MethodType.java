package com.upskill.java_1;

public class MethodType {

		/* Types of Methods perenthasis/culibraket
		 *Void Method
		 *Static Method
		 *Return Type Method 	 
	*/
		public static int hourlyIncome = 79;
		public static void main(String[] args) {
			MethodType obj = new MethodType();
			obj.annualIncomeVoid();
			
			System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
			weeklyIncomeStatic();
			
		}
	
//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
//Static Method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
}
