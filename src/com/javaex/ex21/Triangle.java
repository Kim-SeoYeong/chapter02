package com.javaex.ex21;

public class Triangle extends Shape{
	//필드
	private int Theight;
	private int Twidth;
	
	//생성자
	public Triangle() {}

	public Triangle(String fillColor, String lineColor, int theight, int twidth) {
		super(fillColor, lineColor);
		Theight = theight;
		Twidth = twidth;
	}

	//메소드-getter/setter
	public int getTheight() {
		return Theight;
	}

	public void setTheight(int theight) {
		Theight = theight;
	}

	public int getTwidth() {
		return Twidth;
	}

	public void setTwidth(int twidth) {
		Twidth = twidth;
	}
	
	//메소드 - 일반
	public void draw() {
		System.out.println("삼각형- #면색 : " + getFillColor() + ", #선색 : " + getLineColor() +
							", #가로 : " + Twidth + ", #세로 : " + Theight);
	}
	
	public double area() {
		return Twidth * Theight * (2/1);
	}

	@Override
	public String toString() {
		return "Triangle [Theignt=" + Theight + ", Tweight=" + Twidth + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	
}
