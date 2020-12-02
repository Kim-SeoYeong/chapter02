package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열준비
		Rectangle[] rArray = new Rectangle[3];
		//사각형 테스트
		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 10);
		Rectangle r02 = new Rectangle("빨강", "파랑", 20, 30);
		Rectangle r03 = new Rectangle("빨강", "초록", 200, 100);

		//배열에 주소값 대입
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		/*
		r01.draw();
		r02.draw();
		r03.draw();
		*/
		
		//원테스트
		Circle c01 = new Circle("파랑", "빨강", 4);
		c01.draw();
	}

}
