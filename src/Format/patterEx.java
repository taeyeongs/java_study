package Format;

import java.util.regex.Pattern;

public class patterEx {

	public static void main(String[] args) {
		//02-222-2222
		//010-2222-3232
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";//패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data); //matches(패턴, 검증하고 싶은 테이터)
		System.out.println(result);
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "test@navercom";
		
		boolean result2 = Pattern.matches(regExp, data);
		System.out.println(result2);
	}

}
