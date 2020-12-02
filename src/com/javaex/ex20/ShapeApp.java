package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//shape 테스트
		Shape s01 = new Shape("빨강", "파랑");
		System.out.println(s01.toString());
	
		Rectangle r01 = new Rectangle("노랑","파랑",100,200);
		r01.draw();
		
		Circle c01 = new Circle("초록", "노랑", 5);
		c01.draw();
		*/
		
		//Shape 배열 만들기
		Shape[] sArray = new Shape[2];
		
		//사각형 만들기
		//Rectangle r01 = new Rectangle("빨강", "파랑", 100, 200);--> 이렇게 사용하면 안됨
		Shape r01 = new Rectangle("빨강", "파랑", 100, 200);
		
		
		//원 만들기
		//Circle c01 = new Circle("초록","노랑", 5); --> 이렇가 사용하면 안됨.
		Shape c01 = new Circle("초록", "노랑", 5);
		
		//배열에 주소값 대입
		sArray[0] = r01;
		sArray[1] = c01;
		
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
		}
		
		//문제발생 --> 추상클래스(abstract)
//		Shape s = new Shape("빨강", "검정");
//		s.draw();
		
		//면적 구하기
		for(int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}

}
