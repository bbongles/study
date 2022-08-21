package ch12;

/*
 * ===================================================================================================
 * 12. 자바의 연산자들(2) - (관계, 논리 연산자)
 * ---------------------------------------------------------------------------------------------------
 * 논리 연산에서 모든 항이 실행되지 않는 경우 - 단락 회로 평가(short circuit evaluation)
 * - 논리곱(&&)은 두 항의 결과가 모두 true일 때만 결과가 true > 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음
 * - 논리합(||)은 두 항의 결과가 모두 false일 때만 결과가 false > 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
 * ===================================================================================================
 */
public class ShortCircuit {

	public static void main(String[] args) {

		int num1 = 10;
		int i = 2;

		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

		value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);

	} // end main()
	
} // end class ShortCircuit
