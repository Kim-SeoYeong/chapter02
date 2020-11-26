package com.javaex.ex11;

public class MyMathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메모리 스토리
		int sum = MyMath.plus(3, 5);
		System.out.println(sum);
		
		double doublesum = MyMath.plus(123.3, 343.3);
		System.out.println(doublesum);
		
		int minusTest = minus(100,10);

	}
	public static int minus(int a, int b) {
		return a-b;
	}

}
