package test.ch10.resource;

public class TryWithResourceEx {

	public static void main(String[] args) {
		//try 안에 열고 싶은 리소스 객체 생성
		try(MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);//int 형 변환
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//try 안에 열고 싶은 리소스 객체 생성
		try(MyResource res = new MyResource("B")) {
			String data = res.read2();
			int value = Integer.parseInt(data);//int 형 변환
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
