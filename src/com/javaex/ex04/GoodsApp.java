package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 Goods()
		//setter 사용
		//showInfo() 확인
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showInfo();
		
		//생성자 Goods(String name, int price)
		//setter 사용 X
		//showInfo();
		Goods computer = new Goods("LG그램", 1000000);
		computer.showInfo();
		
		//생성자 Goods(String name)
		//setter 사용 - price만 사용
		//showInfo();
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
	}

}
