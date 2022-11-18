package test.ch07.poly;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();//Driver객체를 생성한다.
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(taxi);//Driver객체의 drive함수에 taxi매개변수를 입력한다.

	}

}
