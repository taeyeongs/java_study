package test.ch09.outer;

public class Athis {
	// Athis 클래스의 인스턴스 필드
	String field = "A-field";

	// Athis클래스의 인스턴스 메소드
	void method() {
		System.out.println("A-method");

	}

	// 인스턴스 멤버 클래스
	class B {
		// B클래스의 인스턴스 필드
		String field = "B-field";

		// B클래스의 인스턴스 메소드
		void method() {
			System.out.println("B-method");

		}

		// B클래스의 인스턴스 메소드
		void print() {
			// B객체의 필드와 메소드를 사용
			System.out.println(this.field);
			this.method();

			// A객체의 필드와 메소드를 사용
			System.out.println(Athis.this.field);
			Athis.this.method();
		}
	}
	
	//A클래스의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}
