package com.practiceset;

public class Car extends Vehicle {

	public void drive() {
		System.out.println("This is car class property...");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.drive();
	}
	
}
