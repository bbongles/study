package ch08;

//다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력해 보세요.
//음식점에 배달 주문이 들어왔습니다.
//주문 접수 번호 : 202011020003
//주문 핸드폰 번호 : 01023450001
//주문 집 주소 : 서울시 강남구 역삼동 111-333
//주문 날짜 : 20201102
//주문 시간 : 130258
//주문 가격 : 35000
//메뉴 번호 : 0003
public class OrderTest {

	public static void main(String[] args) {

		Order myOrder = new Order();
		myOrder.orderNumber = "202011020003";
		myOrder.customerPhone = "01023450001";
		myOrder.customerAddress = "서울시 강남구 역삼동 111-333";
		myOrder.orderDate = "20201102";
		myOrder.orderTime = "130258";
		myOrder.price = 35000;
		myOrder.menuId = "0003";
		
		myOrder.showOrderDetail();
		
	} // end main()

} // end class OrderTest
