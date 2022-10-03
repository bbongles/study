package ch17;

/*
 * ===================================================================================================
 * 17. static 메서드의 구현과 활용, 변수의 유효 범위
 * ---------------------------------------------------------------------------------------------------
 * static 메서드(클래스 메서드)에서는 인스턴스 변수를 사용할 수 없다.
 * - static 메서드는 인스턴스 생성과 무관하게 클래스 이름으로 호출 될 수 있음
 * - 인스턴스 생성 전에 호출 될 수 있으므로 static 메서드 내부에서는 인스턴스 변수를 사용할 수 없음
 * ---------------------------------------------------------------------------------------------------
 * 변수의 유효 범위와 메모리
 * - 변수의 유효 범위(scope)와 생성과 소멸(life cycle)은 각 변수의 종류마다 다름
 * - 지역 변수, 멤버 변수, 클래스 변수는 유효범위와 life cycle, 시용하는 메모리도 다름
 *   [지역 변수(로컬 변수)]
 *   > 선언 위치 : 함수 내부에 선언
 *   > 사용 범위 : 함수 내부에서만 사용
 *   > 메모리 : 스택
 *   > 생성과 소멸 : 함수가 호출될 때 생성되고 함수가 끝나면 소멸함
 *   [멤버 변수(인스턴스 변수)]
 *   > 선언 위치 : 클래스 멤버 변수로 선언
 *   > 사용 범위 : 클래스 내부에서 사용하고 private이 아니면 참조 변수로 다른 클래스에서 사용 가능
 *   > 메모리 : 힙
 *   > 생성과 소멸 : 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸됨
 *   [static 변수(클래스 변수)]
 *   > 선언 위치 : static 예약어를 사용하여 클래스 내부에 선언
 *   > 사용 범위 : 클래스 내부에서 사용하고 private이 아니면 클래스 이름으로 다른 클래스에서 사용 가능
 *   > 메모리 : 데이터 영역
 *   > 생성과 소멸 : 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸됨  
 * - static 변수는 프로그램이 메모리에 있는 동안 계속 그 영역을 차지하므로 너무 큰 메모리를 할당하는 것은 좋지 않음
 * - 클래스 내부의 여러 메소드에서 사용하는 변수는 멤버 변수로 선언하는 것이 좋음
 * - 멤버 변수가 너무 많으면 인스턴스 생성 시 쓸데없는 메모리가 할당됨
 * - 상황에 적절하게 변수를 사용해야 함
 * ===================================================================================================
 */
public class Employee {

	private static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;

	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		int i = 0;

		// employeeName = "Lee"; //오류발생
		Employee.serialNum = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

} // end class Employee
