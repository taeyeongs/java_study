package test.ch01_3;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		//안에서는 바깥 변수에 접근 가능, 바깥에서는 안의 변수의 접근 불가능.
		if (v1 > 10) {
			int v2 = v1 -10;
		}
//		int v3 = v1 + v2 + 5; // v2는 안에있으며 밖에서 안에 내용을 가져올수없음
		
		int v8 = 10;
		
	}

}
