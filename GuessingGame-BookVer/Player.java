public class Player {
	int guessed = 0;
	
	public void guess() {
		guessed = (int)(Math.random()* ( 10 - 0 ));
	}
}