package exceptions;

public class InvalidPlayersCount extends Exception {
	public void error() {
		System.out.println("Players count is invalid");
	}
}
