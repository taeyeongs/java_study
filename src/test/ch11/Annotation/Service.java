package test.ch11.Annotation;

//@PrintAnnotation
public class Service {
	//필드
	
//	@PrintAnnotation
//	String test;
//	
//	//생성자
//	@PrintAnnotation
//	Service() {}
	
	//메소드
	@PrintAnnotation
	public void method1() {
		System.out.println("method1");
	}
	
	@PrintAnnotation
	public void method2() {
		System.out.println("method2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("method3");
	}
	
}
