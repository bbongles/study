package ch21;

import java.io.IOException;

/*
 * ===================================================================================================
 * 21. Thread 클래스의 여러 메서드들
 * ---------------------------------------------------------------------------------------------------
 * Thread 종료하기
 * - Thread를 종료할 때 사용함
 * - 무한 반복의 경우 while(flag)의 flag 변수값을 false로 바꾸어 종료를 시킴
 * ===================================================================================================
 */
public class TerminateThread extends Thread {

	private boolean flag = false;
	int i;

	public TerminateThread(String name) {
		super(name);
	}

	public void run() {

		while (!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(getName() + " end");

	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	// Thread 종료하기 예제
	public static void main(String[] args) throws IOException {

		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");

		threadA.start();
		threadB.start();
		threadC.start();

		int in;
		while (true) {
			in = System.in.read();
			if (in == 'A') {
				threadA.setFlag(true);
			} else if (in == 'B') {
				threadB.setFlag(true);
			} else if (in == 'C') {
				threadC.setFlag(true);
			} else if (in == 'M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			} else {
				System.out.println("type again");
			}
		}

		System.out.println("main end");

	}

} // end class TerminateThread
