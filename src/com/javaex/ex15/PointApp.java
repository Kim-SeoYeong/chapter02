package com.javaex.ex15;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(4, 5);
		p.ShowPoint();
		
		ColorPoint cp01 = new ColorPoint("red");
		cp01.showInfo();
		
		ColorPoint cp02 = new ColorPoint(10, 8, "red");
		cp02.showInfo();
	}

}
