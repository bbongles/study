package ch01;

// 익명 내부 클래스
// - 이름이 없는 클래스 (위 지역 내부 클래스의 MyRunnable 클래스 이름은 실제로 호출되는 경우가 없음)
// - 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
// - 인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환 할 수 있음.
// - widget의 이벤트 핸들러에 활용 됨
class Outer2 {

	Runnable getRunnable(int i) {

		int num = 100;

		return new Runnable() {

			@Override
			public void run() {
				// num = 200; //에러 남
				// i = 10; //에러 남
				System.out.println(i);
				System.out.println(num);
			}
		};
	}

	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");

		}
	};
	
} // end class Outter2

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();

		Runnable runnerble = out.getRunnable(10);
		runnerble.run();

		out.runner.run();
	}
	
} // end class AnonymousInnerTest
