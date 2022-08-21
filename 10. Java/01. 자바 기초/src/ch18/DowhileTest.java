package ch18;

import java.util.Scanner;

/*
 * ===================================================================================================
 * 18. 반복문 - do-while문
 * ---------------------------------------------------------------------------------------------------
 * 조건과 상관 없이 한번은 수행문을 수행
 * - while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while은 조건과 상관없이 수행을 한번 하고나서 조건을 체크
 * - 문법
 *   do {
 *   	수행문1; // 우선 수행문1을 수행
 *      ...
 *      
 *   } while(조건식); // 조건을 체크 후 조건이 맞으면 다시 수행문1로 수행
 *   
 *   수행문2; // while문의 조건식이 거짓이 되어 do-while문을 빠져 나오면 수행 
 *   ...
 * - 조건이 맞지 않으면(true가 아니면) 더 이상 수행하지 않음
 * ===================================================================================================
 */
public class DowhileTest {

	// 입력받은 모든 숫자의 합을 구하는 예제. 단, 입력이 0이 되면 반복을 그만하고 합을 출력
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;

		do {
			input = scanner.nextInt();
			sum += input;

		} while (input != 0);

		System.out.println(sum);
		
	} // end main()
	
} // end class DowhileTest