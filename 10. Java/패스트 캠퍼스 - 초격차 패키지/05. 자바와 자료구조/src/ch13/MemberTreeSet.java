package ch13;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * ===================================================================================================
 * 13. 정렬을 위해 Comparable과 Comparator 인터페이스 구현하기
 * ---------------------------------------------------------------------------------------------------
 * TreeSet 클래스 활용하기
 * - 객체의 정렬에 사용하는 클래스
 * - Set 인터페이스를 구현하여 중복을 허용하지 않고, 오름차순이나 내림차순으로 객체를 정렬할 수 있음
 * - 내부적으로 이진검색트리(binary search tree)로 구현됨
 * - 이진검색트리에 저장하기 위해 각 객체를 비교해야 함
 * - 비교 대상이 되는 객체에 Comparable이나 Comparator 인터페이스를 구현 해야 TreeSet에 추가 될 수 있음
 * - String, Integer등 JDK의 많은 클래스들이 이미 Comparable을 구현했음
 * ===================================================================================================
 */
public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}

	public void addMember(Member member) {
		treeSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = treeSet.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
} // end class MemberTreeSet