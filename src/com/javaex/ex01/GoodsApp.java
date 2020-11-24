package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Goods camera = new Goods("니콘", 400000);
		//캡슐화때문에 사용 불가
		/*
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		*/
		/*
		camera.setName("니콘");
		String name = camera.getName();
		//System.out.println(name);
		
		camera.setPrice(400000);
		int price = camera.getPrice();
		//System.out.println(price);
		//System.out.println("상품이름: " + name + ", 가격: " + price);
		*/
		camera.showinfo();
		
		
		Goods computer = new Goods("LG그램", 1000000);
		/*
		computer.setName("LG그램");
		String comName = computer.getName();
		//System.out.println(comName);
		
		computer.setPrice(1000000);
		int comPrice = computer.getPrice();
		//System.out.println(comPrice);
		//System.out.println("상품이름: " + comName + ", 가격: " + comPrice);
		*/
		computer.showinfo();
		
		/*
		Goods computer = new Goods();
		
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		Goods cup = new Goods();
		
		cup.name = "머그컵";
		cup.price = 2000;
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		
		camera.price = 450000;
		System.out.println(camera.name);
		System.out.println(camera.price);*/
	}

}
