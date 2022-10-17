package ch05;

import java.util.Arrays;

// 정수 배열에 스트림 생성하여 연산을 수행 하는 예
public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int sumVal = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();

		System.out.println(sumVal);
		System.out.println(count);
	}

} // end class IntArrayTest
