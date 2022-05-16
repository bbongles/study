package monthlychallenge.two;

/* 월간 코드 챌린지 시즌2 > LV1 > 약수의 개수와 덧셈
 * 
 * 문제 설명
 * 두 정수 left와 right가 매개변수로 주어집니다. 
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 * 
 * 입출력 예
 * left	right	result
 * 13	17		43
 * 24	27		52
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
 * 수	약수					약수의 개수
 * 13	1, 13				2
 * 14	1, 2, 7, 14			4
 * 15	1, 3, 5, 15			4
 * 16	1, 2, 4, 8, 16		5
 * 17	1, 17				2
 * 따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
 * 
 * 입출력 예 #2
 * 다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
 * 수	약수							약수의 개수
 * 24	1, 2, 3, 4, 6, 8, 12, 24	8
 * 25	1, 5, 25					3
 * 26	1, 2, 13, 26				4
 * 27	1, 3, 9, 27					4
 * 따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.
 * 
 * ### 소감 ###
 * 약수, 소인수분해, 완전제곱수 등등 오래간만에 수학 용어들을 접하게 되었다.
 * 이렇게 수학적인 부분을 건드려주는 문제가 흥미롭게 느껴진다.
 * 
 */
public class LV1_약수의개수와덧셈 {

	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i < right + 1; i++) {
			int count = 0;

			for (int j = 1; j < i + 1; j++) {
				if (i % j == 0) {
					count++;

				}

			}

			if (count % 2 == 0) {
				answer += i;

			} else {
				answer -= i;

			}

		}

		return answer;

	} // end solution()

	/* ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> 완전제곱수의 경우 무조건 약수의 갸수가 홀수라는 점에 착안한 풀이
	 *    수학적 접근으로 풀이한 부분인 인상 깊다.
	 *
	public int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			// 제곱수인 경우 약수의 개수가 홀수
			if (i % Math.sqrt(i) == 0) {
				answer -= i;
			}
			// 제곱수가 아닌 경우 약수의 개수가 짝수
			else {
				answer += i;
			}
		}

		return answer;
		
	}
	*/

	public static void main(String[] args) {

		int left = 13;
		int right = 17;

		LV1_약수의개수와덧셈 lv1_약수의개수와덧셈 = new LV1_약수의개수와덧셈();
		int result = lv1_약수의개수와덧셈.solution(left, right);

		System.out.println(result);

	} // end main()

} // end class LV1_약수의개수와덧셈
