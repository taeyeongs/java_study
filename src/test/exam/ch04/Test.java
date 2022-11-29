/*
 * 1. 1) 10 < x && x <  20
 * 2) !(ch == '' || ch == '\t') 또는 ch != '' && ch != '\t'
 * 3) ch == 'x' || ch == 'x'
 * 4) '0' <= ch && ch <= '9'
 * 5) ('a' <= ch && ch <= 'z') || ('A'  ch && ch <= 'Z' )
 * 6) year%400 == 0 || year%4==0 && year%100 != 0
 * 7) !powerOn 또는 powerOn == false
 * 8) str.equals("yes") 또는 ""yes".equals(str)
 *
 * 2.
 * 3.
 * 4.
 * 5.
 * 6.
 * 7.
 * 8.
 * 9.
 *
 */

public class Test {
    public static void main(String[] args) {
        //3.
        int sum = 0;
        for(int i=1; i<10; i++) {
            if(i%3 = = 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 합: " + sum);

        //4.
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println(num1, num2);
            if ((num1 + num2) == 5) {
                break;
            }
        }

        // 5.
        for(int x = 1; x <= 10; x++ ) {
            for(int y = 1; y <= 10; y++) {
                if((4 * x + 5*y) == 60) {
                    System.out.println(x , y);
                }
            }
        }

        // 6.
        int sum =0;
        int s = 1;
        int num = 0;
        for (int i = 1; ture; i++; s = -s) {
            num = s * i;
            sum += num ;
            if(sum >= 100 ){
                break;
            }
        }
        System.out.println(num);
        System.out.println(sum);



        //7.
        for(int i =1; i <= 6; i++) {
            for(int j = 1; j <= 6; j++) {
                if(i + j == 6) {
                    System.out.println(i + j);
                }
            }
        }

        //8.
        int num = 1234;
        int sum =0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.prinln(sum);

        //9.
        int num1 =1;
        int num2 = 1;
        int num3 = 0;
        for (int i = 0; i < 8; i++) {
            num3 = num1 + nm2;
            System.out.print("," + num3);
            num1 = num2;
            num2 = num3;
        }

        // 10.
        for(int i = 0; i < 5; i++) {
            for(int j = 0;  j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // 11.
        int answer = (int) (Mah.random() *10 ) + 1;
        int input = 0;
        int count = 0;
        Scanner s = new Scanner(System.in);
        do {
            count++;
            System.out.print("1과 100 사이의 값을 입려하세요 :");
            input = s.nextInt();
            if ( answer == input) {
                System.out.print("값은 :" + input);
                break;
            } else {
                continue;
            }
        } while (true);

        //12.
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);
        while (run){
            System.out.println("------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------");
            System.out.println("선택 > ");
            int menuNum = scanner.nextInt();
            switch(menuNum) {
                case 1:
                    System.out.print("예금액>");
                    balance += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= scanner.nextInt();
                    break;
                case 3:
                    System.out.print("잔고>");
                    System.out.print(balance);
                    break;
                case 4:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램종료");
    }
}