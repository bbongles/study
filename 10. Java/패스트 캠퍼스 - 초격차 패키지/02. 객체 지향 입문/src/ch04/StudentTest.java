package ch04;

public class StudentTest {

	public static void main(String[] args) {

		// 학생 클래스를 생성하여 생성된 객체(인스턴스)에 각각 다른 이름과 주소를 대입
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울";

		studentLee.showStudentInfo();

		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";

		studentKim.showStudentInfo();

		System.out.println(studentLee);
		System.out.println(studentKim);
		
	} // end main()

} // end class StudentTest
