package test.ch07.poly;

public class InstanceOfEx {

	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		if (person instanceof Student) { // person이 Student 객체를 갖고있는지
			Student student = (Student)person;//강제 형변환
			student.study();
			System.out.println(student.studentNo);
		}
	}

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		personInfo(p1);

		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}

}
