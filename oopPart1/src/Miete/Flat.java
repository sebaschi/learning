package Miete;


public class Flat implements Comparable<Flat> {
	
	static int counter = 0;
	
	public int uniqueID;
	private int price;
	private boolean occupied;
	private String name;
	
	public Flat(String name, int price, boolean occupied) {
		this.name = name;
		this.price = 0;
		this.occupied = false;
		this.uniqueID = Flat.counter;
		Flat.counter++;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isOccupied() {
		return this.occupied;
	}
	
	public void changeOccupancyStatus() {
		this.occupied = !this.occupied;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public int compareTo(Flat other) {
		if(this.isOccupied() != other.isOccupied()) {
			if(this.isOccupied()) {
				//ONly this flat is occupied
				return 1;
			} else {
				// other is occupied
				return -1;
			}
		} else {
			//SAME OCCUPANCY STATUS
			if(this.getPrice() > other.getPrice()) {
				return 1;
			} else if( other.getPrice() > this.getPrice()) {
				return -1;
			} else {
				return 0;
			}
		}
	}
}
