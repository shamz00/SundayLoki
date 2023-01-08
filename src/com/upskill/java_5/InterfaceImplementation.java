package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door !");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My car 4 wheel !");
		return 4;
	}

	@Override
	public String iEngine() {
		System.out.println("My car has 5 hp engine !");
		return "5 hp";
	}

}

