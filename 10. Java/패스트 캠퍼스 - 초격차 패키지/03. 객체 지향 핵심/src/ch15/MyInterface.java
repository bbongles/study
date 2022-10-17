package ch15;

public interface MyInterface extends X, Y {

	// 인터페이스의 상속
	// - 인터페이스 사이에도 상속을 사용할 수 있음
	// - extends 키워드를 사용
	// - 인터페이스는 다중 상속이 가능하고 구현 코드의 상속이 아니므로 타입 상속이라고 함
	
	void myMethod();
	
} // end interface MyInterface
