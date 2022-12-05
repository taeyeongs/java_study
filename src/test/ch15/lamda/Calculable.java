package test.ch15.lamda;

@FunctionalInterface //컴파일시 추상메서드가 하나인지 검사
public interface Calculable {
//	void calculate(int x, int y);
	void calculate(int x);

}
