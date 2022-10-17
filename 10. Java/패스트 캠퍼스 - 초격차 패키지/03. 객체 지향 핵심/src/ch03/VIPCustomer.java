package ch03;

public class VIPCustomer extends Customer {

	private int agentID;
	double salesRatio;

	/*
	public VIPCustomer() {
		customerGrade = "VIP"; // 오류 발생
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/

	// super를 이용하여 상위 클래스의 생성자 명시적으로 호출
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;

		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}

	public int getAgentID() {
		return agentID;
	}
	
} // end class VIPCustomer
