package ch15;

//다음과 같은 상황을 구현해 봅시다.
//앞의 예제에서 Edward는 지각을 해서 택시를 타야 했습니다. 
//20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
//택시는 '잘나간다 운수' 회사 택시를 탔습니다.
public class TakeTransTest {

	public static void main(String[] args) {
		Student studentE = new Student("Edward", 20000);
		Taxi wellTaxi = new Taxi("잘 나간다 운수");
		studentE.takeTaxi(wellTaxi);

		studentE.showInfo();
		wellTaxi.showTaxInfo();
		
	} // end main()

} // end class TakeTransTest
