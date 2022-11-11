package test.ch06;

public class Car {
	// 1. 필드: 객체의 데이터를 저장
	//주석추가
	String company = "현대 자동화무장강도";
	String model;
	String color;
	int maxSpeed;
//	boolean start; //시동여부
	int speed;

	Car(String model) {
//		this.model = model;
		this(model, "은색", 250);
	}

	Car(String model, String color) {
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}

	// 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해준다.
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;

	}

}
