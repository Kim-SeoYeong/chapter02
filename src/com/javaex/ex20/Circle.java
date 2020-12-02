package com.javaex.ex20;

public class Circle extends Shape{
	//필드
	private int radius;

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

	//메소드-일반
	public void draw() {
		System.out.println("원-면색 : " + fillColor + ", 선색 : " + lineColor + 
							", 반지름 : " + radius);
	}
	
	public double area() {
		return radius * radius * 3.14;
	}
	
	@Override
	public String toString() {
		return "CIrcle [radius=" + radius + ", getFillColor()=" + getFillColor() + ", getLineColor()=" + getLineColor()
				+ "]";
	}
	
	
	
}
