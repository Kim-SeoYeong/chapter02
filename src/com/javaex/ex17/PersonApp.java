package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*오버라이딩 테스트
		 
		//test --> 섞어쓰기
		//자료형을 통일할려고, 학교정보는 유지하고 싶다.
		Person s01 = new Student("유재석", 44, "서울고등학교");
		
		//자식쪽 Student의 정보를 사용할 수 없다.
		//s01.getSchoolName(); 사용할 수 없다.
		
		s01.showInfo();	//자식쪽의 showInfo()가 부모쪽의 showInfo()를 덮어써서 실행됨
		//부모쪽의 showInfo()를 사용할거라고 생각된다. (X)
		//부모와 자식의 메소드 이름이 같을 경우엔 자식 쪽의 메소드가 덮어씌워짐(O) 
		
		*/
		
		Person[] psArray = new Person[5];
		//오버라이딩이 아님.
		Person p01 = new Person("둘리", 1200);
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		//오버라이딩 부분 (섞어쓰기)
		Person s01 = new Student("유재석", 44, "서울고등학교");
		Person s02 = new Student("강호동", 45, "경기고등학교");
		
		psArray[0] = p01;
		psArray[1] = p02;
		psArray[2] = p03;
		psArray[3] = s01;
		psArray[4] = s02;
		
		for(int i=0; i < psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		System.out.println("===============================================");
		
		System.out.println(((Student)psArray[3]).getSchoolName());
		((Student)psArray[4]).setSchoolName("마산고등학교");
		
		for(int i=0; i < psArray.length; i++) {
			psArray[i].showInfo();
		}
		
		//캐스팅 테스트
		Person t01 = psArray[4];
		//Student t02 = psArray[4];	//오류 양쪽의 자료형이 다름
		Student t03 = (Student)psArray[4];
		Person t04 = (Student)psArray[4];	//자동으로 업캐스팅 된다.
		
	}

}
