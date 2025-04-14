package com.practiceset;

public class Dog extends Animal {

	public void bark() {
		System.out.println("It barks...");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		}
	
}
