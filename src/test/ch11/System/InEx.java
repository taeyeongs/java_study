package test.ch11.System;
import java.io.IOException;

public class InEx {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keycode = 0;
		while(true) {
			//enter키를 읽지 않았을 때 실행
			if(keycode != 13 && keycode != 10) {
				if(keycode == 49) { //숫자1키를 읽었을 경우
					speed++;
				} else if(keycode == 50) { //숫자2
					speed--;
				} else if(keycode == 51) { //숫자3
					break; //while문 나옴
				}
				System.out.println("----------------------------");
				System.out.println("1.증속 2.감속 3.중지");
				System.out.println("----------------------------");
				System.out.println("현재속도=" + speed);
				System.out.println("선택 : ");
			}
			keycode = System.in.read();
		}
		System.out.println("프로그램종료");

	}
	

}
