package test.ch14.vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


//ArrayList : 객체를 인덱스로 관리하고 검색, 삭제가능 / Array보다 속도 느림 / add(), remove() 가능
//Array : 초기화 고정 / 속도 빠름 / 사이즈 변경불가
//Vector : 멀티 스레드 에서 안전하게 처리가능 // 한 스레드만 쓸수있음
public class VectorEx {

	public static void main(String[] args) {
//		List<Board> list2 = new Vector<>(); //List는 vector 의 부모 인터페이스 (안에 ArrayList도 있음)
// 		list2.add();
		// 제너릭은 클래스와 인터페이스만 저장
//		Vector<Integer> list = new Vector<>();
//		list.add(1);
//		list.add(1);
//		list.add(1);
//		list.add(1);

//		Vector<Board> list = new Vector<>(); //중복이 되지 않아 2000 이 나옴(동기화)
		ArrayList<Board> list = new ArrayList<>(); // 중복이 되기때문에 2000이 아니 다르게 나온다 (나올때마다 다름)(비동기화)

		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}

		};
		

		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목", "내용", "글쓴이"));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		//작업 스레드들이 모두 종료 될때까지 메인 스레드를 기다리게 하는코드.
		try {
			threadA.join();
			threadB.join();
		}catch(Exception e) {
			
		}
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();

	}

}
