package test.exam;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}

	}
	
	// 계좌생성하기
    private static void createAccount() {
        System.out.println("--------------");
        System.out.println("계좌생성");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("계좌주: ");
        String owner = scanner.next();
        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();
        
        Account account = findAccount(ano);
        if(account != null) {
        	System.out.println("이미 있는 계좌입니다.");
        	return;
        }
        Account newAccount = new Account(ano, owner, balance);
    
        for(int i=0; i<accountArray.length; i++) {
            if(accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println(accountArray[i].getAno());
                System.out.println(accountArray[i].getOwner());
                System.out.println(accountArray[i].getBalance());
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    // 계좌목록보기
    private static void accountList() {
        System.out.println("--------------");
        System.out.println("계좌목록");
        System.out.println("--------------");
        for (int i = 0; i < accountArray.length; i++) {
            Account account = accountArray[i];
            if (account != null) {
                System.out.print(account.getAno());
                System.out.print(" ");
                System.out.print(account.getOwner());
                System.out.print(" ");
                System.out.print(account.getBalance());
                System.out.println();
            }
        }
    }

    // 예금하기
    private static void deposit() {
    	//계좌번호, 예금액 입력받기(scanner)
    	//계좌번호로 계좌를 찾아야한다.
    	//
        System.out.println("--------------");
        System.out.println("예금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();
        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // 출금하기
    private static void withdraw() {
    	//계좌번호, 예금액 입력받기(scanner)
    	//계좌번호로 계좌를 찾아야한다.
    	//찾은 계좌에 출금을 해준다.
        System.out.println("--------------");
        System.out.println("출금");
        System.out.println("--------------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("출금액: ");
        int money = scanner.nextInt();

        Account account = findAccount(ano);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 성공되었습니다.");
    }

    // Account 배열에서 ano와 동일한 Account 객체 찾기
    //5. accountArray 배열에서 ano 가 동일한 Account 객체를 찾는 역활
    private static Account findAccount(String ano) {
        Account account = null;
        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {//null이 아니면 계좌가
            	//불러온 계좌안에 있는 계좌 번호와 매개변수로	받아온 계좌번호 ano가 맞는지 확인
                String dbAno = accountArray[i].getAno();
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break;
                }
            }
        }
        return account;
    }


}
