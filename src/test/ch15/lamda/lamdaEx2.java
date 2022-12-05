package test.ch15.lamda;

public class lamdaEx2 {

	public static void main(String[] args) {
		Person person = new Person();
		person.action((x,y)->{
			double result = x+y;
			return result;
		});
		person.action((x,y)->x+y); // 생략방식 //return문 하나만일때 중괄호와 return 생략가능
		person.action((x,y)->x-y);
		person.action((x,y)->x*y);
	}

}
