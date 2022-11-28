package test.ch08.field_multi;

public class DriverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.driver(bus);
		driver.driver(taxi);
	}

}
