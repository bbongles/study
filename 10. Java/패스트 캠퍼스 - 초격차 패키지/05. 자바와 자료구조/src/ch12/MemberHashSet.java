package ch12;

import java.util.HashSet;
import java.util.Iterator;

/*
 * ===================================================================================================
 * 11. Collection 요소를 순회하는 Iterator
 * ---------------------------------------------------------------------------------------------------
 * 요소의 순회란?
 * - 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는것
 * - 순서가 있는 List인터페이스의 경우는 Iterator를 사용 하지 않고 get(i) 메서드를 활용할 수 있음
 * - Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함
 * ---------------------------------------------------------------------------------------------------
 * Iterator 사용하기
 * - boolean hasNext() : 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 true를 반환
 * - E next() : 다음에 있는 요소를 반환
 * - MemberArrayList.java 의 removeMember() 메서드를 Iterator를 활용하여 구현
 * ===================================================================================================
 * 12. 중복되지 않게 자료를 관리하는 Set 인터페이스를 구현한 클래스와 그 활용
 * ---------------------------------------------------------------------------------------------------
 * HashSet 클래스
 * - Set 인터페이스를 구현한 클래스와
 * - 멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야 함
 * - 동일성 구현을 위해 필요에 따라 equals()와 hashCode()메서드를 재정의 함
 * - 아이디가 동일한 경우 같은 멤버이므로 중복되지 않도록 Member 클래스의 equals()와 hashCode()메서드를 재정의 함
 * ===================================================================================================
 */
public class MemberHashSet {
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = hashSet.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
	
} // end class MemberHashSet
