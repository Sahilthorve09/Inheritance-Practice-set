package com.practiceset;

public class Circle extends Shape{

	public void cir(int l, int b) {
		float pi = 3.14f;
		System.out.println("Area of circle: "+(pi*(l/b)));
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.shape("Circle");
		c.cir(12, 23);
	}
	
}
