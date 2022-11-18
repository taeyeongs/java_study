package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A2;
//import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B2;

public class C2 {
//	A a = new A(); //A클래스(default) 접근 불가
	B2 b = new B2();
	A2 a1 = new A2(true); // o
	A2 a2 = new A2(1); // X
	A2 a3 = new A2("d"); // X
}
