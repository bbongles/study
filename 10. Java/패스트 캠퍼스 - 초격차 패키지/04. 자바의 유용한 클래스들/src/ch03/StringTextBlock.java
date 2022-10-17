package ch03;

public class StringTextBlock {

	// text block 사용하기 (java 13)
	// 문자열을 """ """ 사이에 이어서 만들 수 있음
	// html, json 문자열을 만드는데 유용하게 사용할 수 있음
	
	public static void main(String[] args) {

		String strBlock = """
				This
				is
				text
				block
				test.""";
		System.out.println(strBlock);

		System.out.println(getBlockOfHtml());

	}

	public static String getBlockOfHtml() {
		return """
				<html>
				    <body>
				        <span>example text</span>
				    </body>
				</html>""";

	}

} // end class StringTextBlock
