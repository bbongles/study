package monthlychallenge.one;

import java.util.ArrayList;
import java.util.Arrays;

/* 월간 코드 챌린지 시즌1 > LV1 > 두 개 뽑아서 더하기
 * 
 * 문제설명
 * 정수 배열 numbers가 주어집니다. 
 * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * numbers의 길이는 2 이상 100 이하입니다.
 * numbers의 모든 수는 0 이상 100 이하입니다.
 * 
 * 입출력 예
 * numbers		result
 * [2,1,3,4,1]	[2,3,4,5,6,7]
 * [5,0,2,7]	[2,5,7,9,12]
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
 * 3 = 2 + 1 입니다.
 * 4 = 1 + 3 입니다.
 * 5 = 1 + 4 = 2 + 3 입니다.
 * 6 = 2 + 4 입니다.
 * 7 = 3 + 4 입니다.
 * 따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
 * 
 * 입출력 예 #2
 * 2 = 0 + 2 입니다.
 * 5 = 5 + 0 입니다.
 * 7 = 0 + 7 = 5 + 2 입니다.
 * 9 = 2 + 7 입니다.
 * 12 = 5 + 7 입니다
 * 따라서 [2,5,7,9,12] 를 return 해야 합니다.
 * 
 * ### 소감 ###
 * 알고리즘 문제를 풀 때, 임포트한 자원들에 대한 내용도 추가해야하는지 몰랐다.
 * 이부분은 내가 그동안 얼마나 문제를 안풀어봤는가에 대한 문제라고 생각한다.
 * 나도 HashSet을 이용하여 중복처리를 할려고 했으나,
 * Wrapper 클랙스인 Integer와 Primitive 자료형인 int 사이의 
 * 그 다음 스텝으로 넘어가는데 불편함을 겪었다.
 * 
 */
public class LV1_두개뽑아서더하기 {

	public int[] solution(int[] numbers) {

		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (!list.contains(numbers[i] + numbers[j])) {
					list.add(numbers[i] + numbers[j]);

				}

			}

		}

		answer = new int[list.size()];
		for (int t = 0; t < list.size(); t++) {
			answer[t] = list.get(t);

		}

		Arrays.sort(answer);

		return answer;
	}

	/* ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> 해시셋과 스트림메소드를 통해 정렬과 형변환까지 처리한 부분이 인상적이다.
	 * 
	public int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}
		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
	*/

	public static void main(String[] args) {

		LV1_두개뽑아서더하기 lv1_두개뽑아서더하기 = new LV1_두개뽑아서더하기();

		int[] numbers = { 2, 1, 3, 4, 1 };

		int[] result = lv1_두개뽑아서더하기.solution(numbers);
		System.out.println(Arrays.toString(result));

	}

}
