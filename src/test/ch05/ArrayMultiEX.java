package test.ch05;

public class ArrayMultiEX {

	public static void main(String[] args) {
//		int[] scores = {10, 90, 10};

		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };
		System.out.println("1차원 배열 길이(반의 수):" + scores.length);
		System.out.println("1차원 배열 길이(첫번째 반의 학생 수):" + scores[0].length);
		System.out.println("1차원 배열 길이(두번째 반의 학생 수):" + scores[1].length);

		// 첫번째 반의 평균점수

		int class1Sum = 0;
		for (int i = 0; i < scores[0].length; i++) {
			class1Sum += scores[0][1];
		}

		double classAvg = (double) class1Sum / scores[0].length;
		System.out.println("첫번째 반의 평균" + classAvg);

		// 두번째 반의 평균점수
		int class2Sum = 0;
		for (int i = 0; i < scores[1].length; i++) {
			class2Sum += scores[1][i];

		}

		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두번째 반의 평균" + class2Avg);

		// 전체 학생의 평균점수
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for (int k = 0; k < scores[i].length; k++) {
				totalSum += scores[i][k]; // 점수 합산
			}
		}

		
	}

}
