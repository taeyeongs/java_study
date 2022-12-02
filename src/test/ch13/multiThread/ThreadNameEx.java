package test.ch13.multiThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		//main thread 이름 가져오기
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		
		//thread 3개 생성
		for (int i = 0; i < 3; i++) {
			Thread threadA = new Thread() {// 익명 인터페이스 구현 // 익명 클래스 직접 인스턴스화 인터페이스

				@Override
				public void run() {
					System.out.println(getName() + "실행"); // thread 이름을 가져온다.
				}

			};

			threadA.start();
		}
		
		//chat쓰레드 생성
		Thread chatThread = new Thread() {// 익명 인터페이스 구현

			@Override
			public void run() {
				System.out.println(getName() + "실행"); // thread 이름을 가져온다.
			}

		};
		chatThread.setName("chat-thread");
		chatThread.start();
	}
}
