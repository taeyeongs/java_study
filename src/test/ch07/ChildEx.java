package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		/*
		 * //////////자동타입변환////////////// // 자식객체 Child child = new Child(); Parent
		 * parent = child; // 자동 타입 변환
		 * 
		 * parent.method1(); parent.method2();//★오버라이드 된 메소드를 불러온다. // parent.method3();
		 * //★자식 객체에 있는 메소드는 불러오지 못한다.
		 * 
		 * parent.a = 2; // parent.b = 1; //★자식 객체에 있는 필드는 불러오지 못한다.
		 */

		Parent parent = new Child(); // 자동 타입변환

		// instanceof: 객체 타입 확인을 위한 자바에서 제공하는 연산자.
		// parent가 Child객체를 갖고 있지 않다면 강제 타입 변환을 할 수 없음
		if (parent instanceof Child) { // parent매개변수가 Child 객체를 담고있는지를 확인

			Child child = (Child) parent; // 강제타입 변환
			child.b = 1; // 자식 객체에 있는 필드에 접근 가능
			System.out.println(child.b);
			child.method3(); // 자식 객체에 있는 메소드에 접근 가능
		}

	}

}
