package com.javaex.ex20;

public abstract class Shape {
	//필드
	protected String fillColor;
	protected String lineColor;
	
	//생성자
	public Shape() {}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	//메소드-getter/setter
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	//메소드-일반
	//어차피 자식쪽 메소드가 덮어씌워지기때문에 빈상태로 놔둬도됨.
	public abstract void draw();

	public abstract double area();

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	
}
