package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point xy1 = new Point();
		xy1.setX(5);
		xy1.setY(5);

		xy1.draw();
		
		Point xy2 = new Point(10);
		xy2.setY(37);
		xy2.draw();
		
		Point xy3 = new Point(15, 45);
		xy3.draw();
		
	}

}
