package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

// 예외 처리 미루기
// - 예외 처리는 예외가 발생하는 문장에서 try-catch 블록으로 처리하는 방법과 이를 사용하는 부분에서 처리하는 방법 두 가지가 있음
// - throws를 이용하면 예외가 발생할 수 있는 부분을 사용하는 문장에서 예외를 처리할 수 있음
public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생
		Class c = Class.forName(className); // ClassNotFoundException 발생
		return c;
		
	} // end inner class loadClass

	public static void main(String[] args) {

		ThrowsException test = new ThrowsException();

		// 하나의 try{}블록에서 예외가 여러개 발생하는 경우 각각의 예외를 따로 처리할 수도 있음
		try {
			test.loadClass("a.txt", "java.lang.String");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) { // Exception 클래스를 활용하여 defualt 처리를 할 때 Exception 블록은 맨 마지막에 위치해야 함
			e.printStackTrace();
		}
	}
	
} // end class ThrowsException