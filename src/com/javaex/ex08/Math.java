package com.javaex.ex08;
//메소드 오버로드 예제
public class Math {
	//필드 --> 생략
	//생성자--> 기본생성자(생략)
	/*
		public Math() {}
	 */
	//메소드-->getter/setter-->필드가 없으므로(생략)
	
	//일반메소드
	public int plus(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}
}
