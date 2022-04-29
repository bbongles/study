package weeklychallenge;

/* 위클리챌린지 > LV1 > 부족한금액계산하기
 * 
 * 문제설명
 * 새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 
 * 이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 
 * 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
 * 놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
 * 단, 금액이 부족하지 않으면 0을 return 하세요.
 * 
 * 제한사항
 * - 놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수
 * - 처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수
 * - 놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
 * 
 * 입출력 예
 * price	money	count	result
 * 3		20		4		10
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면, 총 필요한 놀이기구의 이용 금액은 30 (= 3+6+9+12) 이 되어 10만큼 부족하므로 10을 return 합니다.
 * 
 * ### 소감 ###
 * 데이터 타입을 맞춰주지 않아서 테스트 케이스 중 처리하지 못하는 케이스들이 있었다.
 * 단순히 속도 문제라고 생갔했다는 부분이 조금 아쉽다.
 * 데이터 타입이 허용할 수 있는 값의 범위에 대한 간과가 아쉽다.
 * 
 */
public class LV1_부족한금액계산하기 {

	public long solution(int price, int money, int count) {
        
		long answer = -1;
		
		long cost =  0;

		// 등차수열의 공식을 활용
		cost = (count * (price + (long) (price * count))) / 2;
		
		// 가지고 있던 money와 비용을 비교
		if (money - cost > 0) {
			answer = 0;
			
		} else {
			answer = cost - money;
			
		}

        return answer;
        
    }
	
	/*
	 * ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> 매개변수의 데이터타입을 임의로 바꾸기는 하였지만
	 *    등차수열을 잘 활용하였고 Math.max 함수를 활용하여
	 *    코드가 간결
	 * 
    public long solution(long price, long money, long count) {
        
    	return Math.max(price * (count * (count + 1) / 2) - money, 0);
        
    }
    */
	
	public static void main(String[] args) {
		
		LV1_부족한금액계산하기 lv1_부족한금액계산하기 = new LV1_부족한금액계산하기();
		long result = lv1_부족한금액계산하기.solution(3, 20, 4);
		
		System.out.println(result);

	}

}
