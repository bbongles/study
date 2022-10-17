package ch02;

public class VIPCustomer extends Customer {

	// 우수 고객(VIPCustomer) 구현
	// - 매출에 더 많은 기여를 하는 단골 고객
	// - 제품을 살 때 10% 할인을 해줌
	// - 보너스 포인트는 제품 가격의 5%를 적립해 줌
	// - 담담 전문 상담원이 배정됨
	// - Customer 클래스에 추가해서 구현하는 것은 좋지 않음
	// - VIPCustomer 클래스를 따로 구현
	// - 이미 Customer에 구현된 내용이 중복되므로 Customer를 확장하여 구현한(상속)
	
	// 멤버 변수
	private int agentID;
	double salesRatio;

	// 생성자
	public VIPCustomer() {
		customerGrade = "VIP"; // 오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}

	// get 메소드
	public int getAgentID() {
		return agentID;
	}
	
} // end class VIPCustomer
