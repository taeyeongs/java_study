package test.ch11.Object;

public class ToStringEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자","안드로이드");
		
		//toString: 객체의 문자정보를 리턴을 한다.
		//@6f2b958e -> 객체를 나타내는 16진수의 해시코드
		//오버라이드를 해서 사용을 할때는 특별하게 나타내고 싶은 문자 정보를 리턴
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
		
		try {
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			System.err.println("에러내용입니다.");
		}

	}

}
