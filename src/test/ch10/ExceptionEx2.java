package test.ch10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
		Class.forName("java.lang.String");//주어진 클래스를 찾는 코드
		
		System.out.println("java.lang.String 클래스가 존재합니다.");
		}catch() {
			
		}

	}

}
