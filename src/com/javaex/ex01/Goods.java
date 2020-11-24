package com.javaex.ex01;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	//메소드-겟터/세터
	//생성자
	public Goods() {}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드-일반
	//name 등록하는 기능
	//setName() 이름 등록
	public void setName(String name) {
		//this.name은 위에 private String name을 의미함.
		this.name = name;	//"니콘","LG그램","머그컵"
	}
	//name 읽어주는 기능
	//getName() 이름 읽기
	public String getName() {
		return name;
	}
	//price 등록하는 기능
	//setPrice() 가격 등록
	public void setPrice(int price) {
		this.price = price;
	}
	//price 읽어주는 기능
	//getPrice() 가격 읽기
	public int getPrice() {
		return price;
	}
	
	public void showinfo() {
		System.out.println("상품이름: " + name + ", 가격: " + price);
	}
}
