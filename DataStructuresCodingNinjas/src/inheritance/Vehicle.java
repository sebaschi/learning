package inheritance;

public class Vehicle {

	private String color;
	protected int maxSpeed;

	public Vehicle() {
		System.out.println("Vehicle's Construcor");
	}

	public void print() {
		System.out.println("Vehicle: " + "color: " + color + " maxSpeed: " + maxSpeed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
