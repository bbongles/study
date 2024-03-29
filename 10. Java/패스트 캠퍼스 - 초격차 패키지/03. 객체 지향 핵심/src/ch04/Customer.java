package ch04;

/*
 * ===================================================================================================
 * 04. 메서드 재정의하기(overriding)
 * ---------------------------------------------------------------------------------------------------
 * 하위 클래스에서 메서드 재정의 하기
 * - 오버라이딩(overriding) : 상위 클래스에 정의된 메서드의 구현 내용이 하위 클래스에서 구현할 내용과 맞지 않는 경우 
 *   하위 클래스에서 동일한 이름의 메서드를 재정의 할 수 있음
 * - VIPCustomer 클래스의 calcPrice()는 할인율이 적용되지 않음
 * - 재정의하여 구현해야 함
 * ---------------------------------------------------------------------------------------------------
 * @Overriding 애노테이션(annotation)
 * - 애노테이션은 원래 주석이라는 의미
 * - 컴파일러에게 특별한 정보를 제공해주는 역할
 * - 몇 가지 애노테이션
 *   @Override : 재정의된 메서드라는 정보 제공
 *   @FunctionalInterface : 함수형 인터페이스라는 정보 제공
 *   @Deprecated : 이후 버전에서는 사용되지 않을 수 있는 변수, 메서드에 사용됨
 *   @SuppressWarnings : 특정 경고가 나타나지 않도록 함 예) @SuppressWarnings("deprecation")은 @Deprecated가
 *                       나타나지 않도록 함
 * - @Overridng 애노테이션은 재정의 된 메서드라는 의미로 선언부가 기존의 메서드와 다른 경우 에러가 남
 * ---------------------------------------------------------------------------------------------------
 * 형 변환과 오버라이딩 메서드 호출
 * - Customer vc = new VIPCustomer();
 *   vc 변수의 타입은 Customer지만 인스턴스의 타입은 VIPCustomer 임
 *   자바에서는 항상 인스턴스의 메서드가 호출 됨 (가상 메서드의 원리)
 *   자바의 모든 메서드는 가상 메서드(virtual method) 임
 * ===================================================================================================
 */
public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	/*
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;

		System.out.println("Customer() 생성자 호출");
	}
	*/

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;

		customerGrade = "SILVER";
		bonusRatio = 0.01;
		// System.out.println("Customer(int, String) 생성자 호출");
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

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

	}
	
} // end class Customer
