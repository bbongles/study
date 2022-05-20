package monthlychallenge.three;

/* 월간 코드 챌린지 시즌3 > LV1 > 나머지가 1이 되는 수 찾기
 *
 * 문제 설명
 * 자연수 n이 매개변수로 주어집니다. 
 * n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
 * 답이 항상 존재함은 증명될 수 있습니다.
 * 
 * 제한사항
 * 3 ≤ n ≤ 1,000,000
 * 
 * 입출력 예
 * n	result
 * 10	3
 * 12	11
 * 
 * 입룰력 예 설명
 * 입출력 예 #1
 * 10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
 * 
 * 입출력 예 #2
 * 12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
 * 
 * ### 소감 ###
 * 문제가 어렵지 않아서 단순히 반복문을 사용하는 것 말고 수학적으로 풀어보고 싶었으나
 * 특별히 사용할 수학적 방법이 없었던 것 같다.
 * 이 문제는 이렇게 푸는것이 가장 깔끔한 것 같다.
 * 
 */
public class LV1_나머지가1이되는수찾기 {

	public int solution(int n) {
		int answer = 0;
		
		for (int i = 2; i < n; i ++) {
			if (n % i == 1) {
				answer = i;
				break;
				
			}
		}
		
		return answer;
		
	} // end solution()
	
	/* ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> 딱히 없음.
	 * 
	 */

	public static void main(String[] args) {

		int n = 12;
		LV1_나머지가1이되는수찾기 lv1_나머지가1이되는수찾기 = new LV1_나머지가1이되는수찾기();
		
		int result = lv1_나머지가1이되는수찾기.solution(n);
		
		System.out.println(result);
		
	} // end main()

} // end class LV1_나머지가1이되는수찾기()
