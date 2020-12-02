package com.javaex.ex21;

public class Rectangle extends Shape{
	//필드
	private int width;
	private int height;

	//생성자
	public Rectangle() {
	}

	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	//메소드-getter/setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드-일반
	public void draw() {
		System.out.println("사각형- #면색 : " + getFillColor() + ", #선색 : " + getLineColor() + ", #가로 : " + width + 
							", #세로 : " + height);
	}
	
	public double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	
	
	
}
