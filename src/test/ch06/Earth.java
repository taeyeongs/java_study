package test.ch06;

public class Earth {
	//상수(변수명은 대문자로 쓴다)
	//final :절대 변경 X, static:전역변수
	static final double EARTH_RADIUS = 6400; //지구 둘레
	static final double EARTH_SURFACE_AREA;
	
	//static 블럭:static 필드를 초기화 해줄때 사용
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
