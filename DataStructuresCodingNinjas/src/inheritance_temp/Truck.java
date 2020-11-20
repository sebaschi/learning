package inheritance_temp;

import inheritance.Vehicle;

public class Truck extends Vehicle {
	
	int maxLoadingCapacity;
	
	// print() overrides Vehicle print function
	
	public Truck(int maxLoadingCapacity, int maxSpeed) {
		
		this.maxLoadingCapacity = maxLoadingCapacity;
		
	}
	public void print() {		
		System.out.println("Vehicle: " + "color: " + getColor() + " maxSpeed: " + maxSpeed + " maxLoadingCapacity " + maxLoadingCapacity);
	}

}
