package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다.
//생성자 public, default, private 접근제한자를 가질 수 있다. 
public class A {
	public int field1;
	int field2;
	private int field3;

	public A() {
		field1 = 1; //o
		field2 = 1; //o
		field3 = 1; //o
		method1(); //o
		method2(); //o
		method3(); //o
	}

	public void method1() {
	}

	void method2() {
	}

	private void method3() {
	}
}
