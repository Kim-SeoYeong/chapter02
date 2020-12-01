package com.javaex.ex18;

public class ColorPoint extends Point {
	//필드
	private String color;

	//생성자
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void pointInfo() {
		System.out.println("X : " + super.getX() + ", Y : " + super.getY() + ", color : " + color);
	}
	
	
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}


}
