package ch16;

/*
 * ===================================================================================================
 * 16. 조건이 여러 개 일 때 간단히 표현되는 switch-case문
 * ---------------------------------------------------------------------------------------------------
 * 문자열이 지원되는 switch-case문
 * ===================================================================================================
 */
public class SwitchCaseTest2 {

	public static void main(String[] args) {
		String medal = "Gold";
		
		switch(medal) {
			case "Gold":
				System.out.println("금메달 입니다.");
				break;
			case "Silver":
				System.out.println("은메달 입니다.");
				break;
			case "Bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				break;
				
		}

	} // end main()
	
} // end class SwitchCaseTest2
