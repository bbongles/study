package ch05;

/*
 * ===================================================================================================
 * 05. 변수(Variable)는 변하는 수입니다.
 * ---------------------------------------------------------------------------------------------------
 * 변수는 언제 쓰나요?
 * - 프로그램에서는 항상 변하는 값을 나타낼 필요가 있음 (ex. 학생의 성적, 합계, 게임의 레벨, 회원 주소 등등...)
 * - 표현하려는 수에 맞는 데이터 타입(자료형)을 이용하여 변수를 선언
 * - 표현하려는 자료가 숫자, 문자 문자열 등 다양할 수 있으므로 그에 맞는 자료형을 사용
 * ---------------------------------------------------------------------------------------------------
 * 변수의 이름 만들 때...
 * - 변수 이름은 영문자(대문자, 소문자)나 숫자를 사용할 수도 있고, 특수문자 중에는 $와 _만 사용 (ex. count100, _master)
 * - 변수 이름의 시작은 숫자로 할 수 없음 (ex. 27days(X), 1abc(X))
 * - 자바에서 이미 사용하고 있는 예약어는 사용할 수 없음 (ex. while, break 등등)
 * - 변수 이름은 프로그램 내에서 사용되는 것이므로 그 용도에 맞고 가독성이 좋게 만드는 것이 중요 (ex. int numberOfStudent;)
 * ===================================================================================================
 */
public class VariableTest {

	public static void main(String[] args) {
		// 변수 선언은 자료형과 변수 명으로 선언함.
		int age, count;
		age = 10;

		int level = 10000; // 선언과 동시에 초기화 할 수 있음

		System.out.println(age);
		System.out.println(level);

	} // end main()

} // end class VariableTest
