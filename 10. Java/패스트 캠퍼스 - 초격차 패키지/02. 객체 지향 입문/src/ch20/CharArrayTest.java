package ch20;

// 문자 배열을 만들어 A-Z 까지 배열에 저장하고 이를 다시 출력하기
public class CharArrayTest {

	public static void main(String[] args) {

		char[] alpahbets = new char[26];
		char ch = 'A';

		for (int i = 0; i < alpahbets.length; i++) {

			alpahbets[i] = ch++;
		}

		for (char alpha : alpahbets) {
			System.out.println(alpha + "," + (int) alpha);
		}
		
	} // end main()

} // end class CharArrayTest
