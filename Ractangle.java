package com.practiceset;

public class Ractangle extends Shape {

	public void rec(int l, int b) {
		System.out.println("Area of ractangle: "+(l*b));
	}
	
	public static void main(String[] args) {
		Ractangle r = new Ractangle();
		r.shape("Ractangle");
		r.rec(12, 22);
	}
	
	
}
