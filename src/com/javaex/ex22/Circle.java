package com.javaex.ex22;

public class Circle extends Shape implements Drawable{
	//필드
	private int radius;
	private static double PI = 3.14;

	//생성자
	public Circle() {}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	//메소드-getter/setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("원- #면색 : " + getFillColor() + ", #선색 : " + getLineColor() + 
				", #반지름 : " + radius);
	}
	
	public double area() {
		return radius * radius * PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	
}
