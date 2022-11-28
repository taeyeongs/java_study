package test.ch09;

public class ALocal {
	void useB(int arg) {
		
		//로컬변수
		int var = 1;
		
		class B {
			//인스턴스 필드
			int field1 = 2;
			
			//생성자
			B() {
				System.out.println("B생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B메소드 실행");
			}
			
			void method2() {
				arg =2;
				var =2;
				
			}
		}
		
		//메소드 안에서 객체 생성
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
}
