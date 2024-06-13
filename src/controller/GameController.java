package controller;

import java.util.List;

import exceptions.InvalidBotCount;
import exceptions.InvalidPlayersCount;
import models.Game;
import models.Player;
import winningStratergy.WinningStratergy;

public class GameController {
	public Game game; 
	  
	// First Start the Game.
//	public void StartGame(int dimensions, List<Player> p,List<WinningStratergy> winningStratergies) {
//		
//	}
    public Game StartGame(int dimension, List<Player> p,List<WinningStratergy> winningStratergies)
		throws InvalidBotCount, InvalidPlayersCount {
		// This is used to create object using Builder Design Pattern.
		Game game =  Game.getInstanceBuilder()
						 .setDimension(dimension)
						 .setPlayers(p)
						 .setWinningStratergies(winningStratergies)
						 .build();
		return game;
		// Game.getInstanceBuilder().addPlayer(p1).addPlayer(p2)....
		//.addWinningStrater(w1).addWinningStrater(w2)
		
		
		} 
	
	public void displayBoard() {
		game.getBoard().printBoard();
		
	}
	
	public void makeMove() {
		//TODO
	}
}
