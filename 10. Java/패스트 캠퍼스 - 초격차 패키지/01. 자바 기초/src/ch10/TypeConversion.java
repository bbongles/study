package ch10;

/*
 * ===================================================================================================
 * 10. 변하지 않는 상수와 리터럴, 변수의 형 변환
 * ---------------------------------------------------------------------------------------------------
 * 리터럴(literal)
 * - 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함
 * - 리터럴은 상숭 풀(constant pool)에 있음
 * - 정수 리터럴은 int로 실수 리터럴은 double로 저장됨
 *   정수의 범위가 넘어가는 경우에는 L 또는 l을 float로 사용하려는 경우는 F 또는 f 식별자를 써줘야 함.
 * ---------------------------------------------------------------------------------------------------
 * 형 변환(type conversion)
 * - 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
 * - 묵시적 형변환(explicit type conversion, 자동 형변환)과 명시적 형변환(implicit type conversion, 강제 형변환)이 있음
 * - 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 짐
 * - 덜 정밀한 자료형에서 더 정밀한 자료형으로 형 변환은 자동으로 이루어 짐
 * - 정밀함 정도 > 괄호는 바이트 표시
 *   byte(1) > short(2), char(2) > int(4) > long(8) > float(4) > double(8)
 * ===================================================================================================
 */
public class TypeConversion {

	public static void main(String[] args) {

		double dNum = 1.2;
		float fNum = 0.9F;

		int iNum1 = (int) dNum + (int) fNum;
		int iNum2 = (int) (dNum + fNum);

		System.out.println(iNum1);
		System.out.println(iNum2);
		
	} // end main()

} // end class TypeConversion
