package oopPart1;

public class Carpet {

	private double cost;
	
	public Carpet(double c) {
		if(c < 0) {
			this.cost = 0.0;
		} else {
			this.cost = c;
		}
	}
	
	public double getCost() {
		return cost;
	}
}
