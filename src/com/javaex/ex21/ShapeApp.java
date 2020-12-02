package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] sArray = new Shape[3];
	
		//객체생성
		Shape r01 = new Rectangle("빨강", "파랑", 6, 10);
		Shape c01 = new Circle("노랑", "초록", 5);
		Shape t01 = new Triangle("보라", "핑크", 8, 10);
		
		//배열에 넣어줌
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		//draw() 출력
		for(int i=0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		
		//area() 출력
		for(int i=0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}

}
