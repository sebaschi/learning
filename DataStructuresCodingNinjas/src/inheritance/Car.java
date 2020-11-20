package inheritance;

public class Car extends Vehicle{

	int numDoors;
//	int maxSpeed;
	
	public Car(int numDoors, int maxSpeed) {
//		super(maxSpeed);
		System.out.println("Car's Construcor");
		this.numDoors = numDoors;
	}
	
	public void print() {
		super.print();
		System.out.println("Car "+"numDoors: " + numDoors);
	}
	
	public void printMaxspeed() {
		super.maxSpeed = 150;
		System.out.println(maxSpeed + " " + super.maxSpeed);
	}
}
