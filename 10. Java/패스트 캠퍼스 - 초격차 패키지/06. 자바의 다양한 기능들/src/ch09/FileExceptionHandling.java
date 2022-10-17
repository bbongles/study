package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ===================================================================================================
 * 09. 예외 처리하기와 미루기
 * ---------------------------------------------------------------------------------------------------
 * try-catch 문
 * - try 블록에는 예외가 발생할 가능성이 있는 코드를 작성하고 try 블록 안에서 예외가 발생하믄 경우 catch 블록이 수행됨
 *   try {
 *   	예외가 발생할 수 있는 코드 부분
 *   } catch(처리할 예외 타입 e) {
 *   	try 블록 안에서 예외가 발생했을 때 예외를 처리하는 부분
 *   }
 * ---------------------------------------------------------------------------------------------------
 * try-catch-finally 문
 * - finally 블럭에서 파일를 닫거나 네트웍을 닫는 등의 리소스 해제 구현을 함
 * - try{} 블럭이 수행되는 경우, finally{} 블럭은 항상 수행 됨
 * - 여러 개의 예외 블럭이 있는 경우 각각에서 리소스를 해제하지 않고 finally 블록에서 해제하도록 구현함
 * - 컴파일러에 의해 예외가 처리 되는 예 (파일 에러 처리)
 * ---------------------------------------------------------------------------------------------------
 * try-with-resources문
 * - 리소스를 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 함
 * - 자바 7부터 제공되는 구문
 * - 리소스를 try() 내부에서 선언해야만 함
 * - close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제됨
 * - 해당 리소스 클래스가 AutoCloseable 인터페이스를 구현 해야 함
 * - FileInputStream의 경우에는 AutoCloseable을 구현하고 있음
 * - 자바9 부터 리소스는 try() 외부에서 선언하고 변수만을 try(obj) 와 같이 사용할 수 있음
 * ===================================================================================================
 */
public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			// return;
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
	}

} // end class FileExceptionHandling
