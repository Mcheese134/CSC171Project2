

public class Game {
	
	public static void startGame() {
		
		Player player = new Player();
		GameInit init = new GameInit();
		
		System.out.println(GameInit.clubs[1].shot(2));
		System.out.println(GameInit.courses[0].getHolePar(1));
		System.out.println(GameInit.courses[0].getCoursePar());
		System.out.println(GameInit.courses[0].getCourseName());
	}
}
