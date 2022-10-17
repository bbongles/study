package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	// 파일에서 바이트 배열로 자료 읽기(배열에 남아 있는 자료가 있을 수 있음에 유의)
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("input2.txt")) {

			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				/*
				 * for(byte b : bs){ System.out.print((char)b); }
				 */
				for (int k = 0; k < i; k++) {
					System.out.print((char) bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}

			/*
			 * while ( (i = fis.read(bs, 1, 9)) != -1){ for(int k= 0; k<i; k++){
			 * System.out.print((char)bs[k]); } System.out.println(": " +i + "바이트 읽음" ); }
			 */

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
	
} // end class FileInputStreamTest3