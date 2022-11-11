package test.ch04;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 1-1
//		int x = 12;
//		if(x > 10 && x < 20) {
//			System.out.println("1-1.");
//		}
		// 1-2
//		char ch = " ";
//		ch = 3;
		// 1-3
		// 1-3
		// 1-4
		// 1-5
		// 1-6
		// 1-7
		// 1-8

//		// 2. 완료
//		int sum = 0;
//		for(int i = 1; i<=100; i++) {
//			if(i%3 == 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
//		
//		
//		// 3. 완료
//		int sum2 = 0;
//		for(int i = 1; i<=20; i++) {
//			if((i%3 != 0) && (i%2 != 0)) {
//				sum2 += i;
//			}
//		}
//		System.out.println(sum2);

		// 4. 완료
//		boolean run = true;
//		int sum = 0;
//		while(run) {
//			int i = (int) (Math.random() * 6) +1;
//			int j = (int) (Math.random() * 6) + 1;
//			sum = i + j;
//			System.out.println(i+":" + j + "합은 : "+sum);
//			if(sum == 5) {
//				System.out.println("종료");
//				break;
//			} else {
//				sum = 0;
//				continue;
//			}
//		}

		// 5.
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j<=10; j++) {
//				(4 * i + 5 * j == 60)
//			}
//		}

		// 6.완료
//		int i = 1;
//		boolean run = true;
//		int sum = 0;
//		while (run) {
//			i++;
//			if(i%2==0) {
//				sum += i * -1;
//			} else {
//				sum += i;
//			}
//			if(sum == 100) {
//				System.out.println(i);
//				System.out.println(sum);
//				break;
//			}
//		}

		// 7. 완료
//		int sum = 0;
//		for(int i = 1; i <= 6; i++) {
//			for(int j = 1; j <= 6 ; j++) {
//				sum  = i + j ;
//				if(sum ==6) {
//					System.out.println(i+":"+j +" 합은 = "+ sum);
//				}
//			}
//		}

		// 8.
//		int num = 1234;
//		
//		//9.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + ","+ num2);
		for(int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print(","+ num3);
			num1 = num2;
			num2 = num3;
		}

		// 10. 완료
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//
//		// 11. 완료
//		int answer = (int) (Math.random() * 10)+ 1;
//		int input = 0;
//		int count = 0;
//		Scanner s = new Scanner(System.in);
//		do {
//			count++;
//			System.out.print("1과 100 사이의 값을 입력하세요 : ");
//			input = s.nextInt();
//			if (answer == input) {
//				System.out.print("값은 : " + input);
//				break;
//			} else {
//				continue;
//			}
//
//		} while (true);

		// 12. 표시줄 두줄나옴
//		Scanner scan = new Scanner(System.in);
//		boolean run = true;
//		long price = 0;
//		while(run) {
//			System.out.println("---------------------");
//			System.out.println("1.예금 | 2.출근 | 3.잔고 | 4.종료");
//			System.out.println("---------------------");
//			String strNum = scan.nextLine();
//			if (strNum.equals("1")) {
//				int strPrice = scan.nextInt();
//				price += strPrice;
//				System.out.println("예금액 >" + price);
//			} else if (strNum.equals("2")) {
//				int strPrice = scan.nextInt();
//				price -= strPrice;
//				System.out.println("출금액 >" + strPrice);
//			} else if (strNum.equals("3")) {
//				System.out.println("잔액 >" + price);
//			}else if (strNum.equals("4")) {
//				System.out.println("프로그램종료");
//				run = false;
//				break;
//			}
//			
//		}
	}
}
