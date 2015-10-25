public class GuessingGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startgame() {
		int answer = (int)(Math.random()* ( 10 - 0 ));
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		p1.guess();
		p2.guess();
		p3.guess();
		
		System.out.println("Player one guessed, " + p1.guessed);
		System.out.println("Player two guessed, " + p2.guessed);
		System.out.println("Player three guessed, " + p3.guessed);
	
		System.out.println("The anwer was, " + answer);
		
		if (p1.guessed == answer) {
			System.out.println("Player one won!");
		}
		if (p2.guessed == answer) {
			System.out.println("Player two won!");
		}
		if (p3.guessed == answer) {
			System.out.println("Player three won!");
		}
		
		if (p1.guessed != answer && p2.guessed != answer && p3.guessed != answer) {
			System.out.println("Everyone lost.");
		}
	}
}