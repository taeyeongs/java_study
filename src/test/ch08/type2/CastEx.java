package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		/*
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare();
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		*/
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		ride(taxi); // bus의 인스턴스를 확인해서 실행이안된다
		ride(bus);
		

	}
	
	public static void ride(Vehicle vehicle) {
		//vehicle 이 Bus 객체를 가지고 있냐? Vehicle vehicle= new Bus(); 
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
	}

}
