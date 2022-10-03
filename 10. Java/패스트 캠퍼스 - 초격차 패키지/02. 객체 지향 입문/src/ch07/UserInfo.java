package ch07;

/*
 * ===================================================================================================
 * 07. 여러가지 생성자를 정의하는 생성자 오버로딩(overloading)
 * ---------------------------------------------------------------------------------------------------
 * 생성자 정의하기
 * - 생성자를 구현해서 사용할 수 있음
 * - 클래스에 생성자를 따로 구현하면 기본 생성자(default constructor)는 제공되지 않음
 * - 생성자를 호출하는 코드(client 코드)에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음
 * ===================================================================================================
 */
public class UserInfo {

	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;

	public UserInfo() {
	}

	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId;
		this.userPassWord = userPassWord;
		this.userName = userName;
		
	}

	public String showUserInfo() {
		return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다.";
		
	} // end showUserInfo()
	
} // end class UserInfo
