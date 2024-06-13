package models;

import java.util.ArrayList;

import controller.GameController;
import exceptions.InvalidBotCount;
import exceptions.InvalidPlayersCount;
import winningStratergy.WinningStratergy;

public class Main {

	public static void main(String[] args) throws InvalidBotCount, InvalidPlayersCount {
		// TODO Auto-generated method stub
		GameController gc = new GameController();
		
		gc.StartGame(0, new ArrayList<>(), new ArrayList<>());
		
		gc.displayBoard();
		// Loop Runs until the game status is in progress.
		while(gc.game.getGameState().equals(GameState.INPROGRESS)) {
			gc.makeMove();
			gc.displayBoard();
		}
		// Checking the game status and printing the winner.
		if(gc.game.getGameState().equals(GameState.DRAW)) {
			System.out.println("Game Draw !!!!!!!!");
		}else if(gc.game.getGameState().equals(GameState.SUCCESS)) {
			System.out.println("Winner is "+gc.game.getWinner().getName());
		}
	}

}
