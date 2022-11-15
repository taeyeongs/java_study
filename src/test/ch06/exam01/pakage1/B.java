package test.ch06.exam01.pakage1;

public class B {
//	A a = new A(); //A클래스(default) 접근 가능
	
	A a1 = new A(true); // o
	A a2 = new A(1); // o
	A a3 = new A("d"); // X
}
