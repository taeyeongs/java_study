package test.ch06;

public class Calculator {
	//메소드 오버로딩: 같은 이름의 메소드 여러개를 만든다.
	// 매개변수의 순서, 갯수, 타입 중 하나가 달라야 한다.
	double areaRectangle(double width) {
		return width * width;
	}
	
	double areaRectangle(double width, double height) {
		return width * height;
	}
	/*
	//리턴 값이 없는 메소드 선언
	 void powerOn() {
		 System.out.println("전원을 켭니다. ");
	 }
	 //int형으로 리턴 값이 있는 메소드
	 int plus(int x, int y) {
		 int result = x + y;
		 return result;
	 }
	 //double형으로 리턴값이 있는 메소드
	 double divide(int x, int y) {
		 double result = (double)x / (double)y;
		 return result;
	 }
	 
	 //리턴 값이 없는 메소드 선언	 
	 void powerOff() {
		 System.out.println("전원을 끕니다.");
	 }
	 */
}
