package monthlychallenge.two;

/* 월간 코드 챌린지 시즌2 > LV1 > 음양더하기
 * 
 * 문제설명
 * 어떤 정수들이 있습니다. 
 * 이 정수들의 절댓값을 차례대로 담은 정수 배열 absolutes와 
 * 이 정수들의 부호를 차례대로 담은 불리언 배열 signs가 매개변수로 주어집니다. 
 * 실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * absolutes의 길이는 1 이상 1,000 이하입니다.
 *  - absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
 *  signs의 길이는 absolutes의 길이와 같습니다.
 *  - signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.
 * 
 * 입출력 예
 * absolutes	signs				result
 * [4,7,12]		[true,false,true]	9
 * [1,2,3]		[false,false,true]	0
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다.
 * 따라서 세 수의 합인 9를 return 해야 합니다.
 * 
 * 입출력 예 #2
 * signs가 [false,false,true] 이므로, 실제 수들의 값은 각각 -1, -2, 3입니다.
 * 따라서 세 수의 합인 0을 return 해야 합니다.
 * 
 * ### 소감 ###
 * 두 배열의 값을 적절히 활용하여 합하면 되는 문제였기 때문에 어렵지 않았다.
 * 다만, 삼항 연산자를 쓰면 더 간결하게 코딩할 수 있었는데
 * if-else를 너무 빈번히 사용하는 것 같아 스스로에게 아쉽다.
 * 
 */
public class LV1_음양더하기 {

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 123456789;

		answer = 0;
		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i] == false) {
				answer -= absolutes[i];
				
			} else {
				answer += absolutes[i];
				
			}
		}
		
		return answer;

	} // end solution()
	
	/* ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> 삼항 연산자를 사용하여 한줄로 음양의 합을 구한 부분이 인상적이다.
	 *    if-else 문을 사용한 것보다 코드의 라인이 훨씬 적고 가독성이 좋다.
	 *    
	 *    삼항 연산자 예)
	 *    데이터타입 변수명 = 조건문 ? 참일때 반환값 : 거짓일때 반환값
	 *    int a = (4 > 3) ? 40 : 30;
	 * 
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i]) ? absolutes[i] : -absolutes[i];
            
        }
        
        return answer;
        
    }
    */

	public static void main(String[] args) {

		int[] absolutes = { 4, 7, 12 };
		boolean[] signs = { true, false, true };

		LV1_음양더하기 lv1_음양더하기 = new LV1_음양더하기();
		int result = lv1_음양더하기.solution(absolutes, signs);

		System.out.println(result);

	} // end main()

} // end class LV1_음양더하기
