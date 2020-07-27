package boardGame;

public class Piece {

	protected Position position;
	private Board borad;
	
	public Piece(Board borad) {
		this.borad = borad;
		position = null; // já é null por default
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	protected  Board getBorad() {
		return borad;
	}

	
	
	
	
}
