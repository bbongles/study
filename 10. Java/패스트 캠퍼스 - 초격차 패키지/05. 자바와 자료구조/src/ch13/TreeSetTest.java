package ch13;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		// String 클래스는 이미 Comprable 인터페이스가 구현되어 있으므로 오름차순으로 정렬되어 출력됨
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");

		for (String str : treeSet) {
			System.out.println(str);
		}
	}
	
} // end class TreeSetTest
