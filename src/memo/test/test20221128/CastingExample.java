package memo.test.test20221128;

import test.ch08.type2.Bus;

public class CastingExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();

		vehicle.run();
		
		if(vehicle instanceof Bus) {
			
			Bus bus = (Bus)vehicle;
			bus.run();
			bus.checkFare();
		}
	}

}
