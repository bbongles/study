package monthlychallenge.one;

/* 월간 코드 챌린지 시즌1 > LV1 > 3진법 뒤집기
 * 
 * 문제설명
 * 자연수 n이 매개변수로 주어집니다. 
 * n을 3진법 상에서 앞뒤로 뒤집은 후, 
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 * 
 * 입출력 예
 * n	result
 * 45	7
 * 125	229
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 답을 도출하는 과정은 다음과 같습니다.
 * n (10진법)		n (3진법)		앞뒤 반전(3진법)	10진법으로 표현
 * 45			1200		0021			7
 * - 따라서 7을 return 해야 합니다.
 * 
 * 입출력 예 #2
 * 답을 도출하는 과정은 다음과 같습니다.
 * n (10진법)		n (3진법)		앞뒤 반전(3진법)	10진법으로 표현
 * 125			11122		22111			229
 * - 따라서 229를 return 해야 합니다.
 * 
 * ### 소감 ###
 * 문자열 변수에 주어진 수의 나머지를 차례대로 더하면 10진수를 3진수로 만들고 뒤집는 부분을 생략할 수 있다.
 * 이 문제의 경우 그 뒤집는 부분을 굳이 할 필요가 없다고 판단하여 아래와 같이 문자열에 나머지를 차례대로 더해주었다.
 * 그리고 Integer.parseInt를 활용해 3진수를 10진수로 바꾸어 주었다.
 * 다른 풀이중에서 잘했다고 생각한 소스 자체는 없었지만 Integer.toString(int i, int radix)를 쓴 부분은 참고할 만 한것 같다.
 * 
 */
public class LV1_3진법뒤집기 {

	public int solution(int n) {
		int answer = 0;

		String three = "";
		while (n > 0) {
			three += (n % 3) + "";
			n = n / 3;
		}

		answer = Integer.parseInt(three, 3);

		return answer;

	} // end solution()
	
	/*
	 * ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 없음
	 */

	public static void main(String[] args) {

		LV1_3진법뒤집기 lv1_3진법뒤집기 = new LV1_3진법뒤집기();

		int n = 45;

		int result = lv1_3진법뒤집기.solution(n);
		System.out.println(result);

	} // end main()

} // end class LV1_3진법뒤집기
