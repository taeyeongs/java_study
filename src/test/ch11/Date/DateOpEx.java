package test.ch11.Date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(); //현재 날짜 시간
		
		//데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a");
		System.out.println("현재시간: " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);//1년 더함
		System.out.println(result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2);//2개월 뺌
		System.out.println(result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7);//7일 더해줌
		System.out.println(result3.format(dtf));
	}

}
