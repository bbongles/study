package ch21;

/*
 * ===================================================================================================
 * 21. Thread 클래스의 여러 메서드들
 * ---------------------------------------------------------------------------------------------------
 * join()
 * - 동시에 두 개 이상의 Thread가 실행 될 때 다른 Thread의 결과를 참조 하여 실행해야 하는 경우 join() 함수를 사용
 * - join() 함수를 호출한 Thread가 not-runnable 상태가 감
 * - 다른 Thread의 수행이 끝나면 runnable 상태로 돌아옴
 * ---------------------------------------------------------------------------------------------------
 * interrupt()
 * - 다른 Thread에 예외를 발생시키는 interrupt를 보낸다.
 * - Thread가 join(), sleep(), wait() 함수에의해 not-runnable 상태일 때 
 *   interrupt() 메서드를 호출하면 다시 runnable 상태가 될 수 있음
 * ===================================================================================================
 */
public class JoinTest extends Thread {

	int start;
	int end;
	int total;

	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public void run() {

		int i;
		for (i = start; i <= end; i++) {
			total += i;
		}
	}

	// 1부터 50, 51부터 100 까지의 합을 구하는 두 개의 Thread를 만들어 그 결과를 확인해보세요
	public static void main(String[] args) {

		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);

		jt1.start();
		jt2.start();

		try {
			jt1.join();
			jt2.join();

		} catch (InterruptedException e) {
			System.out.println(e);
		}

		int lastTotal = jt1.total + jt2.total;

		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);

		System.out.println("lastTotal = " + lastTotal);

	}

} // end class JoinTest
