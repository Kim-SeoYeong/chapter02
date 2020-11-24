package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	//생성자
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다." );
	}
	
}
