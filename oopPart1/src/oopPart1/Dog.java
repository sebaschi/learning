package oopPart1;

public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		// TODO Auto-generated constructor stub
		this.setEyes(eyes);
		this.setLegs(legs);
		this.setTail(tail);
		this.setTeeth(teeth);
		this.setCoat(coat);
	}
	
	public void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
		System.out.println();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		move(5);
		System.out.println();
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
		System.out.println();
	}
	
	public void moveLegs() {
		System.out.println("Dog.moveLegs() called");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs();
		super.move(speed);
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}

}
