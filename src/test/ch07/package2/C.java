package test.ch07.package2;

import test.ch07.package1.A;

public class C {
	public void method() {
		A a = new A(); //x
		a.field = "1"; //x
		a.method(); //x
	}
}
