package constants;

public enum Planets {
	MERCURY(4879, 5429, 3.7, 0, 167, 1), VENUS(12.104, 5243, 8.9, 0, 464, 2), EARTH(12.756, 5514, 9.8, 1, 15, 3),
	MARS(6792, 3934, 3.7, 2, -65, 4), JUPITER(142.984, 1326, 23.1, 79, -110, 5), SATURN(120.536, 687, 9.0, 82, -140, 6),
	URANUS(51.118, 1270, 8.7, 27, -195, 7), NEPTUNE(49.528, 1638, 11.0, 14, -200, 8);

	final double diamater;
	final int density;
	final double gravity;
	final int numberOfMoons;
	final int meanTemperature;
	final int order;

	Planets(double diameter, int density, double gravity, int numberOfMoons, int meanTemperature, int order) {
		this.diamater = diameter;
		this.density = density;
		this.gravity = gravity;
		this.numberOfMoons = numberOfMoons;
		this.meanTemperature = meanTemperature;
		this.order = order;

	}

	public double getDiamater() {
		return diamater;
	}

	public int getDensity() {
		return density;
	}

	public double getGravity() {
		return gravity;
	}

	public int getNumberOfMoons() {
		return numberOfMoons;
	}

	public int getMeanTemperature() {
		return meanTemperature;
	}

}
