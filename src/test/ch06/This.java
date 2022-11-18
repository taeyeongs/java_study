package test.ch06;

public class This {
	//필드
	String model;
	int speed;
	
	//매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에는 this를 붙인다.
	This(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		setSpeed(100); //같은클래스 간의 메소드를 호출시 this생략가능
		System.out.println(model + "," + speed); //this 생략가능
	}
}
