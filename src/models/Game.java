package models;

import java.util.ArrayList;
import java.util.List;

import exceptions.InvalidBotCount;
import exceptions.InvalidPlayersCount;
import winningStratergy.WinningStratergy;

public class Game {
	private Board board;
	List<Player> players;
	List<Move> moves;
	private Player winner;
	private int nextPlayerTurn;
	private GameState gameState;
	private List<WinningStratergy> winningStratergies;
	
	public Game(int dimensions, List<Player> players, List<WinningStratergy> winningStratergies) {
		this.board = new Board();
		this.players = players;
		this.moves = new ArrayList<Move>();
		this.winner = null;
		this.nextPlayerTurn = 0;
		this.gameState = GameState.INPROGRESS;
	}
	public List<WinningStratergy> getWinningStratergies() {
		return winningStratergies;
	}
	public void setWinningStratergies(List<WinningStratergy> winningStratergies) {
		this.winningStratergies = winningStratergies;
	}
	public Board getBoard() {
		return board;
	}
	public List<Player> getPlayers() {
		return players;
	}
	public List<Move> getMoves() {
		return moves;
	}
	public Player getWinner() {
		return winner;
	}
	public int getNextPlayerTurn() {
		return nextPlayerTurn;
	}
	public GameState getGameState() {
		return gameState;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}
	public void setWinner(Player winner) {
		this.winner = winner;
	}
	public void setNextPlayerTurn(int nextPlayerTurn) {
		this.nextPlayerTurn = nextPlayerTurn;
	}
	public void setGameState(GameState gameState) {
		this.gameState = gameState;
	}
//	==========================================================  Builder ======================
	public static Builder getInstanceBuilder() {
		return new Builder();
	}
	
	

	public static class Builder {
		//private Board board;
		private List<Player> players;
		private int dimension;
		private List<WinningStratergy> winningStratergies;
		
		public List<Player> getPlayers() {
			return players;
		}
		public int getDimension() {
			return dimension;
		}
		public List<WinningStratergy> getWinningStratergies() {
			return winningStratergies;
		}
		
		public Builder setPlayers(List<Player> players) {
			this.players = players;
			return this;
		}
		public Builder setDimension(int dimension) {
			this.dimension = dimension;
			return this;
		}
		public Builder setWinningStratergies(List<WinningStratergy> winningStratergies) {
			this.winningStratergies = winningStratergies;
			return this;
		}
		
		public void validate() throws InvalidBotCount, InvalidPlayersCount {
			int botCount = 0;
			for(Player p:players) {
				if(p.getPlayerType().equals(PlayerType.BOT)) {
					botCount += 1;
				}
			}
			if(botCount > 1) {
				throw new InvalidBotCount();
			}
			if(players.size() != dimension-1) {
				throw new InvalidPlayersCount();
			}
		}
		
		public Game build() throws InvalidBotCount, InvalidPlayersCount {
			validate();
			return new Game(this.dimension,this.players,this.winningStratergies);
		}
	}
}
