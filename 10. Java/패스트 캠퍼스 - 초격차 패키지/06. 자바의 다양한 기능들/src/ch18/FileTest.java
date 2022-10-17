package ch18;

import java.io.File;
import java.io.IOException;

/*
 * ===================================================================================================
 * 18. 그 외 여러가지 입출력 클래스들
 * ---------------------------------------------------------------------------------------------------
 * File 클래스
 * - 파일 개념을 추상화한 클래스
 * - 입출력 기능은 없고, 파일의 이름, 경로, 읽기 전용등의 속성을 알수 있음
 * - 이를 지원하는 여러 메서드들이 제공됨
 * ===================================================================================================
 */
public class FileTest {

	public static void main(String[] args) throws IOException {

		File file = new File(""); // TODO : newFile.txt 생성할 경로 설정
		file.createNewFile();

		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());

		file.delete();
	}
	
} // end class FileTest
