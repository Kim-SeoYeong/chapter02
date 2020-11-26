package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods item1 = new Goods();
		item1.setName("니콘");
		item1.setPrice(400000);
		System.out.println(item1.getTotalcount());
		
		Goods item2 = new Goods("머그컵");
		item2.setPrice(2000);
		System.out.println(item2.getTotalcount());
		
		Goods item3 = new Goods("LG그램", 1000000);
		System.out.println(item3.getTotalcount());
		
		item1.showInfo();
		item2.showInfo();
		item3.showInfo();
	}

}
