package models;

public class Player {
	private int id;
	private String name;
	private PlayerType playerType;
	private Symbol symbol;
	
	public Player(int id,String name, PlayerType p,Symbol s) {
		this.id = id;
		this.name = name;
		this.playerType = p;
		this.symbol = s;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public PlayerType getPlayerType() {
		return playerType;
	}
	public Symbol getSymbol() {
		return symbol;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	
}
