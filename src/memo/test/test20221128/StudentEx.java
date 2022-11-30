package memo.test.test20221128;

public class StudentEx {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1,1,90,80,95);
		System.out.println(s.getTotal());
		
		System.out.println(s.getAverage());
		System.out.println(s.toString());

	}

}
