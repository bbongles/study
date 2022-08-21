package ch13;

/*
 * ===================================================================================================
 * 13. 자바의 연산자들(3) - (조건 연산자, 비트 연산자)
 * ---------------------------------------------------------------------------------------------------
 * 비트 연산자
 * - 대입연산자와 다른 연산자가 함께 쓰임
 * - 마스크 : 특정 비트를 가리고 몇 개의 비트 값만 사용할 때
 * - 비트켜기 : 특정 비트들만을 1로 설정해서 사용하고 싶을 때 예) &00001111(하위 4비트 중 1인 비트만 꺼내기)
 * - 비트끄기 : 특정 비트들만을 0로 설정해서 사용하고 싶을 때 예) |11110000(하위 4비트 중 0인 비트만 0으로 만들기)
 * - 비트토글 : 모든 비트들을 0은 1로, 1은 0으로 바꾸고 싶을 때
 * - ~ : 비트의 반전(1의 보수) 예) a = ~a;
 *   & : 비트 단위 AND 예) 1 & 1, 1을 반환 그 외는 0
 *   | : 비트 단위 OR 예) 0 | 0, 0을 반환 그 외는 1
 *   ^ : 비트 단위 XOR 예) 두 개의 비트가 서로 다른 경우에 1을 반환
 *   << : 왼쪽 shift 예) a << 2, 변수 a를 2비트 만큼 완쪽으로 이동
 *   >> : 오른쪽 shift 예) a >> 2, a를 2비트 만큼 오른쪽으로 이동
 *   >>> : 오른쪽 shift 예) >>와 동일한 연산, 채워지는 비트가 부호와 상관없이 0임
 * ---------------------------------------------------------------------------------------------------
 * 연산자 우선순위
 * - 일차식>단항>산술>비트이동>관계>비트곱>비트차>비트합>논리곱>논리합>조건>대입 순으로 우선순위가 결정됌  
 * ===================================================================================================
 */
public class BitTest {

	public static void main(String[] args) {

		int num1 = 5; // 00000101
		int num2 = 10; // 00001010

		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);

		System.out.println(num1 << 2);
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);

	} // end main()
	
} // end class BitTest
