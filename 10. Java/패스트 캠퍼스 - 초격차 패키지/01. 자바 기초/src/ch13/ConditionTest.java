package ch13;

import java.util.Scanner;

/*
 * ===================================================================================================
 * 13. 자바의 연산자들(3) - (조건 연산자, 비트 연산자)
 * ---------------------------------------------------------------------------------------------------
 * 조건 연산자
 * - 삼항 연산자
 * - 조건식의 결과가 true(참)인 경우와 false(거짓)인 경우에 따라 다른 결과가 수행됨
 * - if(조건문)을 간단히 표현할 때 사용 할 수 있음
 * - 조건식 ? 결과1 : 결과2; : 조건식이 참이면 결과1, 거짓이면 결과2가 선택됩니다. 예) int num = (5 > 3) ? 10 : 20;
 * ===================================================================================================
 */
public class ConditionTest {

	public static void main(String[] args) {

		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");

		Scanner scanner = new Scanner(System.in);
		System.out.println("입력1:");
		int x = scanner.nextInt();
		System.out.println("입력2:");
		int y = scanner.nextInt();

		max = (x > y) ? x : y;
		System.out.println(max);
		
	} // end main()
	
} // end class ConditionTest
