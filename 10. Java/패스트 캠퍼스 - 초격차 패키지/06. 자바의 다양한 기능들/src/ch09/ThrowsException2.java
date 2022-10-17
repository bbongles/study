package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생
		Class c = Class.forName(className); // ClassNotFoundException 발생
		return c;
		
	} // end inner class loadClass

	public static void main(String[] args) {

		ThrowsException2 test = new ThrowsException2();

		// 하나의 try{}블록에서 예외가 여러개 발생하는 경우 여러개의 예외가 발생하는 경우 예외를 묶어서 하나의 방법으로 처리할 수도 있음
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
} // end class ThrowsException2
