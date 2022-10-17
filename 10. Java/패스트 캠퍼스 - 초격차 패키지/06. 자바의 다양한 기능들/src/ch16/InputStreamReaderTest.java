package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ===================================================================================================
 * 16. 여러가지 보조 스트림 클래스들
 * ---------------------------------------------------------------------------------------------------
 * 보조 스트림
 * - 실제 읽고 쓰는 스트림이 아닌 보조 기능을 제공하는 스트림
 * - FilterInputStream과 FilterOutputStream이 보조 스트림의 상위 클래스들
 * - 생성자의 매개변수로 또 다른 스트림(기반 스트림이나 다른 보조 스트림)을 가짐
 * - Decorator Pattern으로 구현 됨
 * - 상위 클래스 생성자
 *   protected FilterInputStream과(InputStream in) : 생성자의 매개변수로 InputStream을 받습니다.
 *   public FilterOutputStream(OutputStream out) : 생성자의 매개변수로 OutputStream을 받습니다.
 * ===================================================================================================
 */
public class InputStreamReaderTest {

	// InputStreamReader와 OutputStreamWriter
	// - 바이트 단위로 읽거나 쓰는 자료를 문자로 변환해주는 보조 스트림
	// - FileInputStream으로 읽은 자료를 문자로 변환해주는 예
	public static void main(String[] args) {

		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i;
			while ((i = isr.read()) != -1) { // 보조 스트림으로 읽습니다.
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
} // end class InputStreamReaderTest
