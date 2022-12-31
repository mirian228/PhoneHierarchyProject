package constants;

public enum Seasons {
	SPRING(1),
	SUMMER(2),
	FALL(3),
	WINTER(4);
	
	final int order;
	
	Seasons(int order) {
		this.order = order;
	}
}
