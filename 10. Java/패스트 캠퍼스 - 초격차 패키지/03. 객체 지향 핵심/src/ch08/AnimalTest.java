package ch08;

import java.util.ArrayList;

/*
 * ===================================================================================================
 * 07. 상속은 언제 사용 할까?
 * ---------------------------------------------------------------------------------------------------
 * IS-A 관계(is a relationship : inheritance)
 * - 일반적인(general) 개념과 구체적인(specific) 개념과의 관계
 * - 상위 클래스 : 하위 클래스보다 일반적인 개념 (예: Employee)
 * - 하위 클래스 : 상위 클래스보다 구체적인 개념들이 더해짐 (예: Engineer, Manager...)
 * - 상속은 클래스간의 결합도가 높은 설계
 * - 상위 클래스의 수정이 많은 하위 클래스에 영향을 미칠 수 있음
 * - 계층구조가 복잡하거나 hierarchy가 높으면 좋지 않음
 * ---------------------------------------------------------------------------------------------------
 * HAS-A 관계(composition)
 * - 클래스가 다른 클래스를 포함하는 관계 (변수로 선언)
 * - 코드 재사용의 가장 일반적인 방법
 * - Student가 Subject를 포함하는
 * - Library를 구현할 때 ArrayList 생성하여 사용
 * - 상속하지 않음
 * ===================================================================================================
 * 08. 다운 캐스팅과 instanceof
 * ---------------------------------------------------------------------------------------------------
 * 다운 캐스팅(downcasting)
 * - 업 캐스팅된 클래스를 다시 원래의 타입으로 형 변환
 * - 하위 클래스로의 형 변환은 명시적으로 해야 함.
 * - Customer vc = new VIPCustomer();              //묵시적
 *   VIPCustomer vCustomer = (VIPCustomer) vc;      //명시적
 * ---------------------------------------------------------------------------------------------------
 * instanceof를 이용하여 인스턴스의 형 체크
 * - 원래 인스턴스의 형이 맞는지 여부를 체크하는 키워드
 * - 맞으면 true, 아니면 false를 반환 함
 * ===================================================================================================
 */
class Animal {

	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {

	}
	
} // end inner class Animal

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
} // end inner class Human

class Tiger extends Animal {

	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
} // end inner class Tiger

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}

	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
	
} // end inner class Eagle

public class AnimalTest {

	public static void main(String[] args) {

		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		/*
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal);
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);
		*/

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);

		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);

		/*
		for (Animal animal : animalList) {
			animal.move();
		}
		*/

	}

	public void testDownCasting(ArrayList<Animal> list) {

		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);

			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBooks();
			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting();
			} else if (animal instanceof Eagle) {
				Eagle eagle = (Eagle) animal;
				eagle.flying();
			} else {
				System.out.println("error");
			}

		}
	}

	public void moveAnimal(Animal animal) {
		animal.move();

	}

} // end class AnimalTest
