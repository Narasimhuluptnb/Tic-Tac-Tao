package models;

import java.util.List;

public class Board {
	private int size;
	private List<List<Cell>> board;
	
	public int getSize() {
		return size;
	}
	public List<List<Cell>> getBoard() {
		return board;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setBoard(List<List<Cell>> board) {
		this.board = board;
	}
	
	public void printBoard() {
		// printing board
	}
	
	
}
