package com.javaex.ex22;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(3,3);
		p.draw();
		
		Drawable pp = new Point(4,4);
		pp.draw();
		//pp.getX();	//보이지 않음
		
		((Point)pp).getX();	//다운캐스팅 해서 사용
		System.out.println("================================================");
		//점 + 도형 함께 관리
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Rectangle("빨강", "파랑", 5, 10);
		Drawable c01 = new Circle("파랑", "노랑", 8);
		Drawable t01 = new Triangle("주황", "초록", 10, 10);
		Drawable p01 = new Point(5, 5);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
		
		//((Shape)c1).area();
		System.out.println("면적구하기=====================================");
		//전체 면적구하기 --> Point 면적이 없다.
		//순차적으로 area() 만약에 Point면 제외
		for(int i = 0; i < dArray.length; i++) {
			//부모가 shape이면 실행
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
		
		
	} 

}
