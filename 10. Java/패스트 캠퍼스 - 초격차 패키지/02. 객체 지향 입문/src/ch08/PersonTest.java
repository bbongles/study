package ch08;

//다음 설명에 해당되는 객체를 구현하고 해당 정보를 출력해 보세요.
//키가 180 이고 몸무게가 78 킬로인 남성이 있습니다. 이름은 Tomas 이고 나이는 37세입니다.
public class PersonTest {

	public static void main(String[] args) {

		Person personT = new Person();
		personT.name = "Tomas";
		personT.age = 37;
		personT.height = 180;
		personT.weight = 78;
		personT.gender = "남성";
		
		personT.showPersonInfo();
		
	} // end main()

} // end class PersonTest
