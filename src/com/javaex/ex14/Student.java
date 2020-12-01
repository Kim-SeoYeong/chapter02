package com.javaex.ex14;

public class Student extends Person{
	//필드
	private String schoolName;

	//생성자
	public Student() {
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		//Person(); ==> super(); 부모쪽 티폴트 생성자 실행
		//super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		//1. 자신의 생성자 시작 --> 완료X
		//2. 부모의 생성자 ㅎ출
		//	 - 부모의 생성자를 선택할 수 있다.
		//	 - 선택하지 않으면 디폴트 생성자가 실행된다.
		//3. 부모의 생성자 작업이 끝나면 자신의 생성자 작업을 완료한다.
		
		//메모리 올리는 작업
		//Person(); 부모쪽 디폴트 생성자 실행
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	//메소드 - getter/setter
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void showInfo() {
		//부모쪽 변수가 private일때는 getter를 쓰거나 앞에 super을 붙여줘야함.
		System.out.println("학교 : " + schoolName + ", 이름 : " + getName() +", 나이 : " + super.getAge());
		//부모쪽 변수가 protected일때는 그냥 사용해도 에러가 안납.
		System.out.println("학교 : " + schoolName + ", 이름 : " + name +", 나이 : " + age);
	}

	//메소드 - 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	
	

	
}
