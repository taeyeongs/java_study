package test.ch05;

public class Exam {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };

		int pre = 0;
		for(int i=0; i < array.length; i++) {
			if(pre < array[i]) {
				pre = array[i];
				
			}
		}
		System.out.println(pre);

	}

}
