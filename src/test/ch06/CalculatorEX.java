package test.ch06;

public class CalculatorEX {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println(result1);
		System.out.println(result2);
		/*
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		int x = 10, y = 4;
		double result2 = myCalc .divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		*/

	}

}
