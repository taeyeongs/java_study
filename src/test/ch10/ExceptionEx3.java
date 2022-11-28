package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};
		int value = 0;
		for(int i=0; i <= array.length; i++) {
			try {
				value = Integer.parseInt(array[i]); //int으로 형 변환
				System.out.println("array[" + i +  "] : " + value);
			} catch(ArrayIndexOutOfBoundsException e) { // ctrl + space 단축키로 선택
				e.printStackTrace();
			} catch(NullPointerException | NumberFormatException e) { //2가지 이상의 예외를 동일하게 처리
//				e.printStackTrace();
				System.out.println("데이터에 문제가 있음 : " + e.getMessage());
				
			} finally {
				System.out.println(value);
			}
		}

	}

}
