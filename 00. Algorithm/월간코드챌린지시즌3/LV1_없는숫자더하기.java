package monthlychallenge.three;

import java.util.Arrays;

/* 월간 코드 챌린지 시즌3 > LV1 > 없는 숫자 더하기
 * 
 * 문제 설명
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한 사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 * 
 * 입출력 예
 * numbers				result
 * [1,2,3,4,6,7,8,0]	14
 * [5,8,4,0,6,7,9]		6
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 5, 9가 numbers에 없으므로, 5 + 9 = 14를 return 해야 합니다.
 * 
 * 입출력 예 #2
 * 1, 2, 3이 numbers에 없으므로, 1 + 2 + 3 = 6을 return 해야 합니다.
 * 
 * ### 소감 ###
 * 자바8을 공부해야겠다는 생각과 동시에 
 * 콜렉션 함수들에 대한 더 자세한 공부가 필요하다고 생각했다.
 * 배열을 리스트로 변환하는 과정에서의 불편함을 느꼈다.
 * 또한 int와 Integer를 혼용하기 어려움을 느꼈다.
 * 
 */
public class LV1_없는숫자더하기 {

	public int solution(int[] numbers) {
		int answer = -1;

		answer = 0;
		for (int i = 0; i < 10; i++) {
			int checkNum = i;

			if (!Arrays.stream(numbers).anyMatch(x -> x == checkNum)) {
				answer += i;

			}

		}

		return answer;

	} // end solution()

	/* ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> 배열에 원소들이 일정한 규칙을 가지고 있을 경우에는
	 *    아래의 풀이와 같이 전체 값을 더하여
	 *    존재하는 숫자의 값을 빼나가는 방식도 있을 수 있다.
	 *    생각지 못한 방법으로 풀이하여 다른 사람 풀이중 가장 좋았던 것 같다.
	 *    
	public int solution(int[] numbers) {
		int sum = 45;
		
		for (int i : numbers) {
			sum -= i;
		}
		
		return sum;
		
	}
	*/

	public static void main(String[] args) {

		int[] numbers = { 5, 8, 4, 0, 6, 7, 9 };

		LV1_없는숫자더하기 lv1_없는숫자더하기 = new LV1_없는숫자더하기();
		int result = lv1_없는숫자더하기.solution(numbers);

		System.out.println(result);

	} // end main()

} // end class LV1_없는숫자더하기
