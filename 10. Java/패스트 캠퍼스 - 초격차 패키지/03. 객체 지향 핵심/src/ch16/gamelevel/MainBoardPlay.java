package ch16.gamelevel;

public class MainBoardPlay {

	// Player가 있고 Player는 GameLevel 속성을 가집니다. 각 GameLevel 단계 마다 run(), jump(), turn() 세 가지 기능이 업그레이드 됩니다.
	// 초보자 레벨 : 천천히 달립니다. run() 만 가능
	// 중급자 레벨 : 빠르게 달리고, 점프할 수 있습니다. run(), jump() 가능
	// 고급자 레벨 : 엄청 빠르게 달리고, 높게 점프하고, 턴할 수 있습니다. run(), jump(), turn() 가능
	// Player는 한번에 하나의 레벨 상태만을 가질 수 있습니다.
	// Player가 play() 중에 레벨에 있는 go(int count) 라는 메서드를 호출하면 run() 하고 count 횟수 만큼 jump() 하고 turn() 합니다. 
	// 다음 클래스 다이어그램(https://gitlab.com/easyspubjava/javacoursework/-/raw/master/Chapter3/3-16/img/player.png)을 참고하여 
	// 각 레벨에서 go() 가 호출 될때 다음과 같이 출력 되도록 하세요.
	
	public static void main(String[] args) {

		Player player = new Player();
		player.play(1);

		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);

		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);

	}

} // end class MainBoardPlay
