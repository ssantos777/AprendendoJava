package chess.boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece() {
		
	}
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}

	protected void setBoard(Board board) {
		this.board = board;
	}

	public Piece[][] possibleMoves() {
		return null;
	}
	
	public boolean possibleMove(Position position) {
		return true;
	}
	
	public boolean isThereAnyPossibleMove() {
		return true;
	}
}