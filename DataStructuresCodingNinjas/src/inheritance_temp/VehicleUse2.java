package inheritance_temp;

import java.util.Scanner;

import inheritance.Car;
import inheritance.Vehicle;

public class VehicleUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n < 10) {
			v = new Car(4, 100);			
		} else {
			v = new Vehicle();
		}
		
		v.print();
		
//		Car c = new Vehicle(); no polymorphism up the line!

	}

}
