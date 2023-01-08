package com.upskill.java_6;

public class Singleton {

	private Singleton(){
		
	}
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return SingletonObj;
	}
protected static void demo(){
	System.out.println("Demo method for singleton class");
}
}
