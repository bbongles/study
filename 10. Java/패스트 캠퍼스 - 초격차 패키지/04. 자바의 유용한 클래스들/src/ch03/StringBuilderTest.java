package ch03;

public class StringBuilderTest {

	// StringBuilder, StringBuffer 활용하기
	// 내부적으로 가변적인 char[]를 멤버 변수로 가짐
	// 여러번 연결하거나 변경할 때 사용하면 유용함
	// 새로운 인스턴스를 생성하지 않고 char[] 를 변경함
	// StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화(synchronization)을 보장
	// 단인 쓰레드 프로그램에서는 StringBuilder 사용을 권장
	// toString() 메서드로 String 반환
	
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");

		StringBuilder buffer = new StringBuilder(java);
		System.out.println(System.identityHashCode(buffer));
		buffer.append("android");
		System.out.println(System.identityHashCode(buffer));

		java = buffer.toString();
	}
	
} // end class StringBuilderTest