package ch21;

/*
 * ===================================================================================================
 * 21. 중간에 멈추는 break문, 무시하고 계속 진행하는 continue문
 * ---------------------------------------------------------------------------------------------------
 * continue문 사용하기
 * - 반복문 내부에서 조건문(if)와 같이 사용하며, 조건이 맞는 경우(true이면) 이후 반복문 블럭 내부의 다른 수행문들을 수행하지 않음
 * ===================================================================================================
 */
public class ContinueTest {

	// 1부터 100까지 숫자 중 3의 배수를 출력
	public static void main(String[] args) {
		int num;
		for (num = 1; num <= 100; num++) {

			if ((num % 3) != 0)
				continue;

			System.out.println(num);

		}
		
	} // end main()
	
} // end class ContinueTest
