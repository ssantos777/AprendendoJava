package chess.boardgame;

public class Position {
	
	private int row;
	private int column;
	
	public Position() {
		
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public void setValues(int row, int column) {
		this.column = column;
		this.row = row;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}