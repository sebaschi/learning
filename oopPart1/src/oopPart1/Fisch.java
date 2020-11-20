package oopPart1;

public class Fisch extends Animal {
	
	private int gills;
	private int eyes;
	private int fins;
	
	public int getGills() {
		return gills;
	}

	public int getEyes() {
		return eyes;
	}

	public int getFins() {
		return fins;
	}

	public void setGills(int gills) {
		this.gills = gills;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}
	

	public Fisch(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}
	
	public void rest() {
		System.out.println("resting");
	}
	private void moveMuscles() {
		System.out.println("moveMuscles() called");
	}
	private void moveBackfin() {
		System.out.println("moveBackfin() called");
	}
	public void swim(int speed) {
		System.out.println("swim() called");
		moveMuscles();
		moveBackfin();
		super.move(speed);
	}
	
	

}
