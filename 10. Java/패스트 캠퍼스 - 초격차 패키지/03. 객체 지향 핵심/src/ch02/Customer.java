package ch02;

/*
 * ===================================================================================================
 * 01. 객체 간의 상속은 어떤 의미일까?
 * ---------------------------------------------------------------------------------------------------
 * 클래스 상속
 * - 새로운 클래스를 정의 할 때 이미 구현된 클래스를 상속(inheritance) 받아서 속성이나 기능을 확장하여 클래스를 구현함
 * - 이미 구현된 클래스보다 더 구체적인 기능을 가진 클래스를 구현해야 할 때 기존 클래스를 상속함
 * - 상속하는 클래스 : 상위 클래스, parent class, base class, super class
 * - 상속받는 클래스 : 하위 클래스, child class, derived class, sub class
 * - 상속의 문법 : class B extends A {}
 * - extends 키워드 뒤에는 단 하나의 클래스만 올 수 있음. 즉, 자바는 단일 상송(single inheritance)만을 지원함.
 * ---------------------------------------------------------------------------------------------------
 * 상속을 구현하는 경우
 * - 상위 클래스는 하위 클래스보다 더 일반적인 개념과 기능을 가짐
 * - 하위 클래스는 상위 클래스보다 더 구체적인 개념과 기능을 가짐
 * - 하위 클래스가 상위 클래스의 속성과 기능을 확장(extends)한다는 의미
 * ===================================================================================================
 * 02. 상속을 활용한 멤버십 클래스 구현하기
 * ---------------------------------------------------------------------------------------------------
 * 멤버십 시나리오
 * - 회사에서 고객 정보를 활용한 맞춤 서비스를 하기 위해 일반고객(Customer)과 이보다 충성도가 높은 우수고객(VIPCustomer)에
 *   따른 서비스를 제공하고자 함
 * - 물품을 구매할 때 적용되는 할인율과 적립되는 보너스 포인트의 비율이 다름. 여러 멤버십에 대한 각각 다양한 서비스를 제공할 수 있음
 *   멤버십에 대한 구현을 클래스 상속을 활용하여 구현해보기
 * ---------------------------------------------------------------------------------------------------
 * protected 접근 제어자
 * - 상위 클래스에 선언된 private 멤버 변수는 하위 클래스에서 접근 할 수 없음
 * - 외부 클래스는 접근 할 수 없지만, 하위 클래스는 접근 할 수 있도록 protected 접근 제어자를 사용  
 * ===================================================================================================
 */
public class Customer {

	// 일반 고객(Customer) 클래스 구현
	// - 고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립 비율
	// - 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립

	// 멤버 변수
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	// 생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
		
	} // end calcPrice()

	// get / set 메소드
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다";

	} // end showCustomerInfo()
	
} // end class Customer
