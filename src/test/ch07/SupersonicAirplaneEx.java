package test.ch07;

public class SupersonicAirplaneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode= SupersonicAirplane.SUPERSONIC;
		sa.fly();
	}

}
