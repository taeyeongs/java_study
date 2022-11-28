package test.ch11.System;

public class MeasureRunTime {

	public static void main(String[] args) {
		int sum = 0;
		long time1 = System.nanoTime();
		for(int i=1; i<= 1000000; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println(sum);
		System.out.println((time2 - time1) + "나노초가 소요되었습니다.");
	}

}
