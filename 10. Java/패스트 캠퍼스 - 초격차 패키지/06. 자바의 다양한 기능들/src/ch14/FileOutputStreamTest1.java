package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ===================================================================================================
 * 14. 바이트 단위 입출력 스트림
 * ---------------------------------------------------------------------------------------------------
 * OutputStream
 * - 바이트 단위 출력 스트림 최상위 추상 클래스
 * - 많은 추상 메서드가 선언되어 있고 이를 하위 스트림이 상속받아 구현함
 * - 주요 하위 클래스
 *   FileOutputStream : 파일에서 바이트 단위로 자료를 씁니다.
 *   ByteArrayOutputStream : byte 배열 메모리에서 바이트 단위로 자료를 씁니다.
 *   FilterOutputStream : 기반 스트림에서 자료를 쓸 때 추가 기능을 제공하는 보조 스트림의 상위 클래스
 * - 주요 메서드
 *   int write() : 한 바이트를 출력합니다.
 *   int write(byte b[]) : b[] 크기의 자료를 출력합니다.
 *   int write(byte b[], int off, int len) : b[] 배열에 있는 자료의 off 위치부터 len 개수만큼 자료를 출력합니다.
 *   void flush() : 출력을 위해 잠시 자료가 머무르는 출력 버퍼를 강제로 비워 자료를 출력합니다.
 *   void close() : 출력 스트림과 연결된 대상 리소스를 닫습니다. 출력 버퍼가 비워집니다.   
 * ---------------------------------------------------------------------------------------------------
 * flush() 와 close() 메서드
 * - 출력 버퍼를 비울때 flush() 메서드를 사용
 * - close() 메서드 내부에서 flush()가 호출되므로 close()메서드가 호출되면 출력 버퍼가 비워짐
 * ===================================================================================================
 */
public class FileOutputStreamTest1 {

	// 파일에 한 바이트씩 쓰기
	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("output.txt")) {
			fos.write(65); // A
			fos.write(66); // B
			fos.write(67); // C
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
	
} // end class FileOutputStreamTest1
