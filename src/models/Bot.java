package models;

public class Bot extends Player{
	
	private BotDificulty botDificulty;
	
	public Bot(int id, String name, Symbol s, BotDificulty botDificulty) {
		super(id, name, PlayerType.BOT, s);
		this.botDificulty = botDificulty;
	}


	public BotDificulty getBotDificulty() {
		return botDificulty;
	}

	public void setBotDificulty(BotDificulty botDificulty) {
		this.botDificulty = botDificulty;
	}
	
	
}
