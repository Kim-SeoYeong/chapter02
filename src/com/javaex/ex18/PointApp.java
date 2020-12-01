package com.javaex.ex18;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Point p01 = new ColorPoint(5, 6, "yellow");
		p01.pointInfo();
		*/
		
		Point[] cpArray = new Point[5];
		
		Point p02 = new Point(4, 5);
		Point p03 = new Point(15, 27);
		//오버라이딩 부분(섞어쓰기)
		Point p04 = new ColorPoint(6, 7, "red");
		Point p05 = new ColorPoint(12, 47, "blue");
		Point p06 = new ColorPoint(3, 39, "green");
		
		cpArray[0] = p02;
		cpArray[1] = p03;
		cpArray[2] = p04;
		cpArray[3] = p05;
		cpArray[4] = p06;
		
		for(int i = 0; i < cpArray.length; i++) {
			cpArray[i].pointInfo();
		}
		
		System.out.println("=================================");
		
		((ColorPoint)cpArray[4]).setColor("purple");
		
		for(int i = 0; i < cpArray.length; i++) {
			cpArray[i].pointInfo();
		}
		
		Point t01 = cpArray[0];
		Point t02 = (ColorPoint)cpArray[3];
		ColorPoint t03 = (ColorPoint)cpArray[3];
	}

}
