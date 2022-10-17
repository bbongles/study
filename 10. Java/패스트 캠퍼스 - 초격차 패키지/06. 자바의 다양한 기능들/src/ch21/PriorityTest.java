package ch21;

/*
 * ===================================================================================================
 * 21. Thread 클래스의 여러 메서드들
 * ---------------------------------------------------------------------------------------------------
 * Thread 우선순위
 * - Thread.MIN_PRIORITY(=1) ~ Thread.MAX_PRIORITY(=10)
 * - 디폴트 우선순위 : Thread.NORMAL_PRIORITY(=5)
 * - 우선 순위가 높은 Thread가 CPU의 배분을 받을 확률이 높다
 * - setPriority()/getPriority()
 * ===================================================================================================
 */
class PriorityThread extends Thread {

	public void run() {

		int sum = 0;

		Thread t = Thread.currentThread();
		System.out.println(t + "start");

		for (int i = 0; i <= 1000000; i++) {

			sum += i;
		}

		System.out.println(t.getPriority() + "end");
	}
	
} // end inner class PriorityThread

public class PriorityTest {

	// Thread 우선순위 예제
	public static void main(String[] args) {

		int i;
		for (i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {

			PriorityThread pt = new PriorityThread();
			pt.setPriority(i);
			pt.start();

		}
	}

} // end class PriorityTest
