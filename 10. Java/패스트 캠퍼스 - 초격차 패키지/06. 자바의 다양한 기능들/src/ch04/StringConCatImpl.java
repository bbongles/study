package ch04;

/*
 * ===================================================================================================
 * 04. 객체지향 프로그래밍 vs 람다식 구현
 * ---------------------------------------------------------------------------------------------------
 * 객체 지향 프로그래밍과 람다식 비교
 * - 문자열 두 개를 연결하여 출력하는 예제를 두 가지 방식으로 구현해 보자
 * - 객체 지향 프로그래밍 : 인터페이스 선언 > 인터페이스를 구현한 클래스 생성 > 클래스의 메서드 호출
 * - 람다식
 *   StringConcat concat2 = (s, v)->System.out.println(s + "," + v ); // System.out.println(i);
 *   concat2.makeString(s1, s2);
 * ---------------------------------------------------------------------------------------------------
 * 익명 객체를 생성하는 람다식
 * - 자바에서는 객체 없이 메서드가 호출 될 수 없음
 * - 람다식을 구현하면 익명 내부 클래스가 만들어지고, 이를 통해 익명 객체가 생성됨
 * - 익명 내부 클래스에서와 마찬가지로 람다식 내부에서 에서도 외부에 있는 지역 변수의 값을 변경하면 오류가 발생함
 * ---------------------------------------------------------------------------------------------------
 * 함수를 변수처럼 사용하는 람다식
 * - 인터페이스형 변수에 람다식 대입하기
 *   PrintString lambdaStr = s->System.out.println(s); //람다식을 변수에 대입
 *   lambdaStr.showString("hello lambda_1");
 * - 매개변수로 전달하는 람다식
 *   showMyString(lambdaStr); 
 *   public static void showMyString(PrintString p) {
 *   	p.showString("hello lambda_2");
 *   }
 * - 반환 값으로 쓰이는 람다식
 *   public static PrintString returnString() { //반환 값으로 사용
 *   	return s->System.out.println(s + "world");
 *   }
 *   
 *   PrintString reStr = returnString();  
 *   reStr.showString("hello ");
 * ===================================================================================================
 */
public class StringConCatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}
	
} // end class StringConCatImpl
