package oopPart1;

public class Car {
	
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String color;
	
	
	//Setters
	public void setModel(String model) {
		this.model = model;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	// Getters
	public String getModel() {
		return this.model;
	}
	public String getEngine() {
		return this.engine;
	}
	public String getColor() {
		return this.color;
	}
	public int getDoors() {
		return this.doors;
	}
	public int getWheels() {
		return this.wheels;
	}
	
	

}
