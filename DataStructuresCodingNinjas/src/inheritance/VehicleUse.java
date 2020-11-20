package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		
//		Vehicle v = new Vehicle();
		
//		Car c = new Car(5, 100);			// Creating a car object first also calls the vehicle constructor;
//		c.print();
		Vehicle v = new Car(10,20);
		Object o = new Vehicle();
		
		v.maxSpeed = 100;
		v.print();
		v = new Vehicle();
		v.setColor("green");
//		Car c = (Car) v; dangerous casting
//		v.numDoors = 4;
//		Vehicle v3 = new Bicycle(12);

		
		v.maxSpeed = 80;
		v.setColor("red");
		v.print();
//		
//		Car c = new Car();
//		c.color = "Black";
//		c.maxSpeed = 100;
//		c.numDoors = 4;
//		c.setColor("black");
//		c.printMaxspeed();
//		c.print();
//		c.printCar();
		
//		Bicycle b = new Bicycle();
//		b.print();

	}

}
