package test.ch14.vector;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>(); //단순저장은 ArrayList보다 느리나 추가/삭제 가 많을때는 더 빠르다.
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n",  "걸린시간 ArrayList: ", (endTime - startTime));
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n", "걸린시간 LinkedList: ", (endTime - startTime));

	}

}
