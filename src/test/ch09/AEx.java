package test.ch09;

public class AEx {
	public static void main(String[] args) {
		//외부에서 B 클래스 사용하기.
		/*
		A a = new A();
		
		A.B b = a.new B();
		*/
		 
		A a = new A();
		a.useB();
	}
}
