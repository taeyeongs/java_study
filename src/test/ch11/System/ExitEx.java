package test.ch11.System;

public class ExitEx {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			if (i == 5) {
				// 프로세스 종료
				System.out.print("프로세스 강제 종료");
				System.exit(0);
				//0 : 정상종료
				//1 또는 -1: 비정상 종료
			}
		}

	}

}
