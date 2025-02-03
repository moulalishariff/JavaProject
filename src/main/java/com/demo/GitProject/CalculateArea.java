package com.demo.GitProject;

class Circle implements Shape{
	public double radius;
	public Circle(double r) {
		this.radius=r;
	}
	@Override
	public void calculateArea() {
		double area=3.14*radius*radius;
		System.out.println("Area of the Circle: "+area);
	}
}
class Rectangle implements Shape{
	public int length,breadth;
	public Rectangle(int l, int b) {
		this.length=l;
		this.breadth=b;
	}
	@Override
	public void calculateArea() {
		double area=length*breadth;
		System.out.println("Area of the Rectangle: "+area);
	}
}
class Triangle implements Shape{
	public int base,height;
	public Triangle(int b, int h) {
		this.base=b;
		this.height=h;
	}
	@Override
	public void calculateArea() {
		double area=0.5*base*height;
		System.out.println("Area of the Triangle: "+area);
	}
}
public class CalculateArea {
	public static void main(String[] args) {
		Shape c=new Circle(5);
		c.calculateArea();
		Shape r=new Rectangle(5,6);
		r.calculateArea();
		Shape t=new Triangle(2,5);
		t.calculateArea();
	}

}
