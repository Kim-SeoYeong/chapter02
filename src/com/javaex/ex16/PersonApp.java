package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Person 배열관리
		Person[] pArray = new Person[3];
		
		Person p01 = new Person("둘리", 1203);
		//System.out.println(p01.toString());
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		p01.showInfo();
		//100명 관리중
		for(int i = 0; i < pArray.length; i++) {
			pArray[i].showInfo();
		}
		

		Student[] sArray = new Student[2];
		
		Student s01 = new Student("유재석", 48, "서울고등학교");
		Student s02 = new Student("강호동", 47, "경기고등학교");
		
		sArray[0] = s01;
		sArray[1] = s02;
		
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].showInfo();
		}
		
		
//		System.out.println(s01.toString());
		
		/*
		s01.showInfo();	//부모쪽 showInfo()가 호출됨 --> 학교정보가 없다
		s01.showInfo2(); //Student가 원하는 showInfo() 기능
		*/
		
		//s01.showInfo() 를 사용할 수도 있게 된다.
		
		
//		Student.showInfo2()  --> Student.showInfo() 메소드를 같게 만들어준다.
		//s01.showInfo(); //메소드 이름이 같으면 부모쪽의 showInfo()를 사용할 수 없다.

	}

}
