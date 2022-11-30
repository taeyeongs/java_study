package memo.test.test20221128;

public class Test {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int count = arr.length;
		int sum = 0;
		for(int arrs : arr) {
			sum += arrs;
			
		}
		System.out.println("합 : " + sum);
		System.out.println("평균 : " + (sum / count));
		
		
		
		int[] ary = {500, 100, 50 , 10};
		
		int money = 2680;
		int nam = 0;
		int fiveh = 0;
		int oneh = 0;
		int fivet = 0;
		int onet = 0;
		
		nam = money ; 
		for(int aryr : ary) {
			if(aryr == 500) {
				fiveh = nam / aryr;
			} else if (aryr == 100) {
				oneh = nam / aryr;
			} else if (aryr == 50) {
				fiveh = nam / aryr;
			} else if (aryr == 10) {
				fiveh = nam / aryr;
				
			}
			System.out.println(nam);
			nam = nam % aryr;
		}
		
		System.out.println("500원 : " + fiveh+ ", 100원 : " +oneh + ", 50원 : " +fivet+", 10원 : " + onet);
		
//		int fivehnam = money % 500;
//		int fiveh = money / 500;
//		int oneh = fivehnam / 100;
//		int onehnam = fivehnam % 100;
//		
//		int fivetnam = onehnam % 50;
//		int fivet = onehnam / 50;
//		int onetnam = fivetnam % 10;
//		int onet = fivetnam / 10;
//		
//		System.out.println("500원 : " + fiveh+ ", 100원 : " +oneh + ", 50원 : " +fivet+", 10원 : " + onet);
		

	}

}

