package ch15;

/*
 * ===================================================================================================
 * 15. 조건이 여러 개 일 때의 if문
 * ---------------------------------------------------------------------------------------------------
 * if-else if문과 if-if문의 차이점
 * - if-else if를 사용하는 경우 하나의 조건이 만족 되면 나머지 else if 부분은 수행되지 않음
 * - if-if를 사용하게 되면 각각 다른 조건문으로 해석되어 각각 모두 수행하게 됨
 * ===================================================================================================
 */
public class IfIfTest {

	public static void main(String[] args) {
		int age = 12;
		int charge;

		if (age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		}
		if (age < 14) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}
		if (age < 20) {
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		} else {
			charge = 3000;
			System.out.println("일반인 입니다.");
		}

		System.out.println("입장료는 " + charge + "원입니다.");

	} // end main()

} // end class IfIfTest
