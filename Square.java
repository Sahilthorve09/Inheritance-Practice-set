package com.practiceset;

public class Square extends Shape{
	
	public void sq(int side) {
		System.out.println("Are of square: "+(side*side));
	}
	
	public static void main(String[] args) {
		Square s = new Square();
		s.shape("Square");
		s.sq(20);
	}
	
}
