package monthlychallenge.one;

/* 월간 코드 챌린지 시즌1 > LV1 > 내적
 * 
 * 문제설명
 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. 
 * a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
 * 
 * 제한사항
 * a, b의 길이는 1 이상 1,000 이하입니다.
 * a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
 * 
 * 입출력 예
 * a			b				result
 * [1,2,3,4]	[-3,-1,0,2]		3
 * [-1,0,1]		[1,0,-1]		-2
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * a와 b의 내적은 1*(-3) + 2*(-1) + 3*0 + 4*2 = 3 입니다.
 * 
 * 입출력 예 #2
 * a와 b의 내적은 (-1)*1 + 0*0 + 1*(-1) = -2 입니다.
 * 
 * ### 소감 ###
 * 문제가 어렵지 않았기 때문에 간단하게 for문을 사용했다.
 * 다른 사람들의 풀이도 거의 비슷한 스타일이었으나, 아래 참고 소스를 보면 IntStream에 map(), sum()을 활용한 풀이가 있다.
 * StreamAPI의 특징은 아래와 같다.
 * - 원본의 데이터를 변경하지 않는다.
 * - 일회용이다.
 * - 내부 반복으로 작업을 처리한다.
 * 
 * 가장 큰 장점은 코드가 간결해지고 가독성이 높아진다는 점이다.
 * 
 */
public class LV1_내적 {

	public int solution(int[] a, int[] b) {
		int answer = 1234567890;

		answer = 0; // 변수 초기화
		// 반복문으로 처리
		for (int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];

		}

		return answer;

	} // end solution()

	/*
	 * ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> IntStream을 활용하여 for문 대신 반복을 진행
	 *    스트림의 요소에 저장된 값 중에서 원하는 필드만 뽑아내거나, 특정 형태로 변환해야 할 때 map() 사용
	 *    마지막으로 sum()를 활용해서 내적을 계산
	 * 
	public int solution(int[] a, int[] b) {
		return IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();
		
	}
	*/

	public static void main(String[] args) {

		LV1_내적 lv1_내적 = new LV1_내적();

		int[] a = { 1, 2, 3, 4 };
		int[] b = { -3, -1, 0, 2 };

		int result = lv1_내적.solution(a, b);
		System.out.println(result);

	} // end main()

} // end class LV1_내적
