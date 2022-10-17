package ch10;

import java.util.ArrayList; // 사용할 클래스 import
import java.util.Iterator;

/*
 * ===================================================================================================
 * 09. 자바에서 제공되는 자료구조 구현 클래스들 - 컬렉션 프레임워크
 * ---------------------------------------------------------------------------------------------------
 * 컬렉션 프레임워크
 * - 프로그램 구현에 필요한 자료구조(Data Structure)를 구현해 놓은 JDK 라이브러리
 * - java.util 패키지에 구현되어 있음
 * - 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
 * - 여러 구현 클래스와 인터페이스의 활용에 대한 이해가 필요함
 * ---------------------------------------------------------------------------------------------------
 * Collection 인터페이스
 * - 하나의 객체를 관리하기 위한 메서드가 선언된 인터페이스의
 * - 하위에 List와 Set 인터페이스가 있음
 * ---------------------------------------------------------------------------------------------------
 * List 인터페이스
 * - 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언된 인터페이스
 * - 자료구조 리스트 (배열, 연결리스트)의 구현을 위한 인터페이스
 * - 중복을 허용함
 * - ArrayList, Vector, LinkedList, Stack, Queue 등...
 * ---------------------------------------------------------------------------------------------------
 * Set 인터페이스
 * - 순서와 관계없이 중복을 허용하지 않고 유일한 값을 관리하는데 필요한 메서드가 선언됨
 * - 아이디, 주민번호, 사번등을 관리하는데 유용
 * - 저장된 순서와 출력되는 순서는 다를 수 있음
 * - HashSet, TreeSet등...
 * ---------------------------------------------------------------------------------------------------
 * Map 인터페이스
 * - 쌍(pair)로 이루어진 객체를 관리하는데 사용하는 메서드들이 선언된 인터페이스
 * - 객체는 key-value의 쌍으로 이루어짐
 * - key는 중복을 허용하지 않음
 * - HashTable, HashMap, Properties, TreeMap 등이 Map 인터페이스를 구현 함
 * ===================================================================================================
 * 10. 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용
 * ---------------------------------------------------------------------------------------------------
 * 멤버십 관리하기
 * - Member 클래스를 만들고, 아이디와 이름을 멤버 변수로 선언
 * - Member 클래스로 생성된 인스턴스들을 관리하는 클래스를 컬렉션 프레임워크 클래스들을 활용하여 구현한다.
 * ---------------------------------------------------------------------------------------------------
 * ArrayList 활용하기
 * - 멤버를 순차적으로 관리함
 * ===================================================================================================
 */
public class MemberArrayList {

	private ArrayList<Member> arrayList; // ArrayList 선언

	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); // 멤버로 선언한 ArrayList 생성
	}

	public void addMember(Member member) { // ArrayList 에 멤버 추가
		arrayList.add(member);
	}

	public boolean removeMember(int memberId) { // 멤버 아이디를 매개변수로, 삭제 여부를 반환

		/*
		for (int i = 0; i < arrayList.size(); i++) { // 해당 아이디를 가진 멤버를 ArrayList에서 찾음
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if (tempId == memberId) { // 멤버아이디가 매개변수와 일치하면
				arrayList.remove(i); // 해당 멤버를 삭제
				return true; // true 반환
			}
		}
		*/

		Iterator<Member> ir = arrayList.iterator();
		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) { // 멤버아이디가 매개변수와 일치하면
				arrayList.remove(member); // 해당 멤버를 삭제
				return true; // true 반환
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다"); // for 가 끝날때 까지 return 이 안된경우
		return false;
	}

	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
} // end class MemberArrayList
