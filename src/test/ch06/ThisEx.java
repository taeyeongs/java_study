package test.ch06;

public class ThisEx {
	public static void main(String[] args) {
		This myCar = new This("포르쉐");
		This yourCar = new This("벤츠");
		
		myCar.run();
		yourCar.run();
	}
}
