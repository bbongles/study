package ch09;

// AutoCloseable인터페이스 구현 실습
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close() 되었습니다");
	}
	
} // end class AutoCloseObj
