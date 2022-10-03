package ch04;

/*
 * ===================================================================================================
 * 04. 객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현
 * ---------------------------------------------------------------------------------------------------
 * 학생 클래스를 정의하고 이를 사용해 보자
 * - 학생 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현
 * ===================================================================================================
 */
public class Student {

	public int studentID;
	public String studentName;
	public String address;

	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
		
	} // end showStudentInfo()

	public String getStudentName() {
		return studentName;
		
	} // end getStudentName()
	
} // end class Student
