package test.ch11.Date;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); // 현재 시간과 날짜를 가져온다.
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일 일요일:1 ~ 토요일7

		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);

		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		System.out.println(strWeek);

		int amPm = now.get(Calendar.AM_PM);
		System.out.println(amPm);
		System.out.println(Calendar.AM);

		if (amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
	}

}
