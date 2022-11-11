package test.ch01_2;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte byteValue = 10;
//		int intValue = byteValue;
//		System.out.println(intValue);
////		long longValue = 5000000000L;
//		
//		char charValue = '가';
//		intValue = charValue;
//		System.out.println(intValue);
//		
//		intValue = 50;
//		long longValue = intValue;
//		System.out.println(longValue);
//		
//		
//		longValue = 100;
//		float floatValue = longValue;
//		System.out.println(floatValue);
//		
//		floatValue= 100.5f;
//		double doubleValue = floatValue;
//		System.out.println(doubleValue);
//		
		//char 타입의 허용범위는 음수 포함하지 않음 byte는 음수가 있기 때문에
//		byte test = 65;
//		char charValue = test;
		
		//char타입의 허용범위는 음수 포함하지 않음 short는 음수가 있기 때문에
//		short a = 1;
//		char b = a;
		
//		int intValue = 103029770;
//		byte byteValue = (byte)intValue;
//		System.out.println(byteValue);
//
//		long var1 = 300;
//		int var4 = (int)var1;
//		System.out.println(var4);
//
//		int var5 = 65;
//		char var6 = (char)var5;
//		System.out.println(var6);
//		
//		double var7 = 3.14;
//		int var8 = (int)var7;
//		System.out.println(var8);
		
//		byte x = 10;
//		byte y = 20;
//		byte result = x + y; // 연산식에서는 자동형변황이됨
//		System.out.println(result);
		
//		byte v3 = 10;
//		int v4 = 100;
//		long v5 = 1000L;
//		long result3 = v3 + v4 + v5;
//		System.out.println(result3);
//		
//		char v6 = 'A';
//		char v7 = 1;
//		int result4 = v6 + v7;
//		System.out.println(result4);
//		
//		int v8 = 10;
//		int result5 = v8 / 4; //정수연산의 결과는 항상 정수
//		System.out.println(result5);
//		
//		int V9 = 10;
////		double result6 = V9 / 4;
//		double result6 = V9 / 4.0;
//		System.out.println(result6);
//		
//		int v10 = 1;
//		int v11 = 2;
//		double result7 = (double)v10 / v11; // 정상적인값
////		double result7 = v10 / (double)v11; // 정상적인값
////		double result7 = v10 / v11;
//		System.out.println(result7);
//		
//		String str = "안녕하세요";
//		int val = 1;
//		String val2 = "3";
//		
//		System.out.println(str + val);
//		System.out.println(val + val2);
//		System.out.println(2 + val + val2);
//		
//		byte value = Byte.parseByte(val2);//문자형을 -> byte형으로
//		int value2 = Integer.parseInt(val2);//문자형을 -> int형으로
//		double value3 = Double.parseDouble(val2);//문자형을 -> double형으로
//		
//		String str2 = String.valueOf(val); //기본형(primiteve형)으로 -> string
//		String str2 = String.valueOf(3.14);
//		String str2 = String.valueOf(true);
		
		System.out.printf("이름: %-6s\n","김자바");//문자열
		System.out.printf("이름: %d\n",25);//정수
		System.out.printf("실수: %10.2f\n", 3.14);//실수
		
		System.out.printf("정수출력1: %-6d\n , 실수출력: %f", 123, 3.14);//실수
		
		
		/* %치환 시작
		 * s 문자열
		 * d 정수
		 * f 실수
		 * .2  .소수점 2 자리수
		 * 10s 앞 자리수 
		 * */
		
	}

}
