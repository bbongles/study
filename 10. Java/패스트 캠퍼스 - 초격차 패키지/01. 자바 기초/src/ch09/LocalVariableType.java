package ch09;

/*
 * ===================================================================================================
 * 09. 자료형(data type) - 논리형과 자료형 없이 변수 사용하기
 * ---------------------------------------------------------------------------------------------------
 * 지역 변수 자료형 없이 사용하기 (자바 10 지원 됨)
 * - Local variable type inference
 * - 추론 가능한 변수에 대한 자료형을 선언하지 않음
 * - 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
 * - 지역 변수만 사용 가능
 * ===================================================================================================
 */
public class LocalVariableType {

	public static void main(String[] args) {

		var i = 10;
		var j = 10.0;
		var str = "hello";

		System.out.println(i);
		System.out.println(j);
		System.out.println(str);

		str = "test";
		// str = 3;
		
	} // end main()
	
} // end class LocalVariableType
