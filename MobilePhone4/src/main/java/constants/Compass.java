package constants;

public enum Compass {
	NORTH(360),
	WEST(270),
	EAST(90),
	SOUTH(180);
	
	final int degree;
	
	Compass(int degree) {
		this.degree = degree;
	}
}
