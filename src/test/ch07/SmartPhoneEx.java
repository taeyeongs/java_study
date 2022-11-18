package test.ch07;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

		//Phone에서 상속 받은 필드 읽기 :  자식 객체에도 부모 필드에 접근가능
		System.out.println(myPhone.model + "," + myPhone.color);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("네 누구세요?");
		myPhone.hangUp();
		
		myPhone.setWifi(false);
		System.out.println(myPhone.wifi);
	}

}
