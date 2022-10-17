package ch13;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Comparator의 활용 : 이미 Comparable이 구현된 경우 Comparator로 비교하는 방식을 다시 구현할 수 있음
class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1;
	}
	
} // end inner class MyCompare

public class ComparatorTest {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");

		System.out.println(set);
	}
	
} // end class ComparatorTest
