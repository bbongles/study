package ch12;

/*
 * ===================================================================================================
 * 12. 자바의 연산자들(2) - (관계, 논리 연산자)
 * ---------------------------------------------------------------------------------------------------
 * 논리 연산자
 * - 관계 연산자와 혼합하여 많이 사용 됨
 * - 연산의 결과가 true(참), false(거짓)으로 반환 됨
 * - && : 두 항이 모두 참인 경우에만 결과 값이 참입니다. 그렇지 않은 경우는 거짓입니다. 예) boolVal = (5 > 3) && (5 > 2); 
 *   || : 두 항 중 하나의 항만 참이면 결과 값이 참입니다. 모두 거짓인 경우 거짓입니다. 예) boolVal = (5 > 3) || (5 > 2);
 *   ! : 단항 연산자입니다. 참인 경우는 거짓으로 바꾸고, 거짓인 경우는 참으로 바꿉니다. 예) boolVal = !(5 > 3);
 * ===================================================================================================
 */
public class LogicalTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		boolean flag = (num1 > 0) && (num2 > 0);
		System.out.println(flag);

		flag = (num1 < 0) && (num2 > 0);
		System.out.println(flag);

		flag = (num1 > 0) || (num2 > 0);
		System.out.println(flag);

		flag = (num1 < 0) || (num2 > 0);
		System.out.println(flag);

		flag = !(num1 > 0);
		System.out.println(flag);

	} // end main()

} // end class LogicalTest
