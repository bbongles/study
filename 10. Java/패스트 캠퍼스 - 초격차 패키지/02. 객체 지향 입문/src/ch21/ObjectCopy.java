package ch21;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibaray = new Book[5];

		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");

		// 자바에서 제공되는 배열 복사 메서드
		// 얕은 복사 : 객체 주소만 복사되어 한쪽 배열의 요소를 수정하면 같이 수정 됨. 즉, 두 배열이 같은 객체를 가리킴
		System.arraycopy(library, 0, copyLibaray, 0, 5);

		System.out.println("======copy library=========");
		for (Book book : copyLibaray) {
			book.showBookInfo();
		}

		library[0].setTitle("나목");
		library[0].setAuthor("박완서");

		System.out.println("======library=========");
		for (Book book : library) {
			book.showBookInfo();
		}

		System.out.println("======copy library=========");

		for (Book book : copyLibaray) {
			book.showBookInfo();
		}
		
	} // end main()
	
} // end class ObjectCopy
