package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//캡슐화
		//메소드를 만들기
		//p1
		Point p1 = new Point(5,5);
		/*
		p1.setX(5);
		int x1 = p1.getX();
		p1.setY(5);
		int y1 = p1.getY();
		*/
		p1.draw();
		
		//p2
		Point p2 = new Point(10,23);
		/*
		p2.setX(10);	
		int x2 = p2.getX();
		p2.setY(23);
		int y2 = p2.getY();
		*/
		p2.draw();
		
		//p3
		Point p3 = new Point(15,4);
		/*
		p3.setX(15);
		int x3 = p3.getX();
		p3.setY(4);
		int y3 = p3.getY();
		*/
		p3.draw();
		
		//p4
		Point p4 = new Point(54,26);
		/*
		p4.setX(54);
		int x4 = p4.getX();
		p4.setY(26);
		int y4 = p4.getY();
		*/
		p4.draw();
		
	}

}
