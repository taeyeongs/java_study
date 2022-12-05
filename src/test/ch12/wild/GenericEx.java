package test.ch12.wild;

public class GenericEx {

	public static void main(String[] args) {
		//모든 사람이 신청 
		 Course.registerCourse1(new Applicant<Person>(new Person()));
		 Course.registerCourse1(new Applicant<Worker>(new Worker()));
		 Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		 Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		 Course.registerCourse1(new Applicant<Student>(new Student()));
		 System.out.println();
		 //학생만 신청
//		 Course.registerCourse2(new Applicant<Person>(new Person()));
//		 Course.registerCourse2(new Applicant<Worker>(new Worker()));
		 Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		 Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		 Course.registerCourse2(new Applicant<Student>(new Student()));
		System.out.println();
		//직장인만 신청
		 Course.registerCourse3(new Applicant<Person>(new Person()));
		 Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		 Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		 Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
//		 Course.registerCourse3(new Applicant<Student>(new Student()));
	}

}
