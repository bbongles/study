package ch14;

/*
 * ===================================================================================================
 * 13. 객체 간의 협력(collaboration)
 * ---------------------------------------------------------------------------------------------------
 * 객체 지향 프로그래밍에서의 협력
 * - 객체 지향 프로그램에서 객체 간에는 협력이 이루어짐
 * - 협력을 위해서는 필요한 메시지를 전송하고 이를 처리하는 기능이 구현되어야 함
 * - 매개 변수로 객체가 전달되는 경우가 발생
 * ===================================================================================================
 * 14. 버스 타고 학교 가는 학생의 과정을 객체 지향 프로그래밍으로 구현해보기
 * ---------------------------------------------------------------------------------------------------
 * 버스와 지하철을 타는 예제 프로그래밍
 * - James와 Tomas는 각각 버스와 지하철을 타고 학교에 갑니다.
 * - James는 5000원을 가지고 있었고, 100번 버스를 타면서 1000원을 지불합니다.
 * - Tomas는 10000원을 가지고 있었고, 초록색 지하철을 타면서 1200원을 지불합니다.
 * - 두 학생이 버스와 지하철을 타는 상황을 구현해 봅시다.
 * ===================================================================================================
 */
public class Student {

	String studentName;
	int grade;
	int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
		
	} // end takeBus()

	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
		
	} // end takeSubway()

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다");
		
	} // end showInfo()
	
} // end class Student
