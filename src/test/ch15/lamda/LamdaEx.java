package test.ch15.lamda;

public class LamdaEx {

	public static void main(String[] args) {
		/*
		action(new Calculable() { //하위 클래스 + 오버라이드
			@Override
			public void calculate(int x, int y) {
				System.out.println(x + y);
			}
		});
		
		action(new Calculable() { //하위 클래스 + 오버라이드
			@Override
			public void calculate(int x, int y) {
				System.out.println(x - y);
			}
		});
		*/
		// 람다식은 인터페이스를 보고 만들며 함수명 제거하고 형 제거하고 표현함
		//람다식은 인터페이스에 단 하나의 추상메서드가 있어야 가능하다
		//람다식 :위의 표현과 같은 작동
//		action((x,y)->System.out.println(x + y));
//		action((x,y)->System.out.println(x - y));
//		action((x,y)->{ //실행두줄이상일때 중괄호가 있어야함
//			System.out.println("결과입니다.");
//			System.out.println(x - y);
//		});
		//매개변수가 하나일땐 생략가능
		action( x->System.out.println(x));
	
	}

	public static void action (Calculable calculable) {
		int x = 10;
		int y = 4;
//		calculable.calculate(x, y);
		calculable.calculate(x);
	}
}
