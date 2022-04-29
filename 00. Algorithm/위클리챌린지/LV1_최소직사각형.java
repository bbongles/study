package weeklychallenge;

/* 위클리챌린지 > LV1 > 최소직사각형
 * 
 * 문제설명
 * 명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다. 
 * 다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다. 
 * 이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
 * 아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.
 * 
 * 명함번호	가로길이	세로길이
 * 1		60		50
 * 2		30		70
 * 3		60		30
 * 4		80		40
 * 
 * 가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다. 
 * 하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.
 * 모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 
 * 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
 * 
 * 제한사항
 * sizes의 길이는 1 이상 10,000 이하입니다.
 * - sizes의 원소는 [w, h] 형식입니다.
 * - w는 명함의 가로 길이를 나타냅니다.
 * - h는 명함의 세로 길이를 나타냅니다.
 * - w와 h는 1 이상 1,000 이하인 자연수입니다.
 * 
 * 입출력 예
 * sizes											result
 * [[60, 50], [30, 70], [60, 30], [80, 40]]			4000
 * [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
 * [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133
 * 
 * 입출력 예 설명
 * 입출력 예 #1
 * 문제 예시와 같습니다.
 * 
 * 입출력 예 #2
 * 명함들을 적절히 회전시켜 겹쳤을 때, 3번째 명함(가로: 8, 세로: 15)이 다른 모든 명함보다 크기가 큽니다. 따라서 지갑의 크기는 3번째 명함의 크기와 같으며, 120(=8 x 15)을 return 합니다.
 * 
 * 입출력 예 #3
 * 명함들을 적절히 회전시켜 겹쳤을 때, 모든 명함을 포함하는 가장 작은 지갑의 크기는 133(=19 x 7)입니다.
 * 
 * ### 소감 ###
 * 이 문제의 핵심은 자버의 Math 클래스의 max, min 함수의 활용이었다.
 * 그 부분을 생각하지 못하고 for문을 빈번히 사용하고 비교연산자를 활용한 것이 아쉽다.
 * 
 */
public class LV1_최소직사각형 {

	public int solution(int[][] sizes) {
        int answer = 0;
        
        // 2차원 배열의 각 원소들에서 너비가 높이보다 작은 경우만 너비와 높이의 위치를 바꾸어 준다.
        for(int i = 0; i < sizes.length; i++) {
        	
        	int w = sizes[i][0];
        	int h = sizes[i][1];
        	
        	if (w < h) {
        		sizes[i][0] = h;
        		sizes[i][1] = w;
        	}
        }
        
        // 2차원 배열의 원소들을 확인하며 가장 큰 너비를 찾는다.
        int wMax = 0;
        for(int i = 0; i < sizes.length; i++) {
        	
        	if(wMax < sizes[i][0]) {
        		wMax = sizes[i][0];
        		
        	}
        	
        }
        
        // 2차원 배열의 원소들을 확인하며 가장 큰 높이를 찾는다.
        int hMax = 0;
        for(int i = 0; i < sizes.length; i++) {
        	
        	if(hMax < sizes[i][1]) {
        		hMax = sizes[i][1];
        		
        	}
        	
        }
        
        // 두 값을 곱하여 반환한다.
        answer = wMax * hMax;
        
        return answer;
        
    } // end solution()
	
	/* ### 다른 사람 풀이 중 가장 깔끔했던 풀이 ###
	 * 
	 * -> 2차원 배열의 각 원소를 Enhanced for문을 활용하여 
	 *    현재 원소의 너비 최대값과 이전의 너비 최대값 중 더 큰값을 변수에 할당하고
	 *    현재 원소의 높이 최소값과 이전의 높이 최소값 중 더 큰값을 변수에 할당하는 방법
	 * 
    public int solution(int[][] sizes) {
        int length = 0, height = 0;
        
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        
        int answer = length * height;
        
        return answer;
        
    }
    */
	    
	public static void main(String[] args) {
		
		LV1_최소직사각형 lv1_최소직사각형 = new LV1_최소직사각형();
		int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		int result = lv1_최소직사각형.solution(arr);
		
		System.out.println(result);

	} // end main()

} // end class LV1_최소직사각형
