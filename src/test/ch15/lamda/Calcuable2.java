package test.ch15.lamda;

@FunctionalInterface // 컴파일시 추상메서드가 하나만 있는지 확인(lamda 식을 사용할때 추상메서드가 하나만있어야함)
public interface Calcuable2 {
	double calc(double x, double y);
}
