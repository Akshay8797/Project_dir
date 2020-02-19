package com.AkshayKumar;
abstract class Shape {
	abstract void draw();
}
class Line extends Shape {
	void draw()
	{
		System.out.println("Line Drawn");
	}
}
class Rectangle extends Shape {
	void draw()
	{
		System.out.println("Rectangle Drawn");
	}
}
class Cube extends Shape {
	void draw()
	{
		System.out.println("Cube Drawn");
	}
}
public class J8 {
	public static void main(String[] args)
	{
		Shape s[]=new Shape[3];
		s[0]=new Line();
		s[0].draw();
		s[1]=new Rectangle();
		s[1].draw();
		s[2]=new Cube();
		s[2].draw();
	}
}		