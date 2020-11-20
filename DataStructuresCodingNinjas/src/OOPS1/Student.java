package OOPS1;

public class Student {

	public String name;
	final private int rollNumber;
	double cgpa;
	final static double CONVERSION_FACTOR = 0.95;		//marked as final --> fixed value, trying to change it later will throw an error
	private static int numStudents;

	public Student(String name) {
		this.name = name;
		numStudents++;
		this.rollNumber = numStudents;
		
	}
	
//	public Student(String name, int rollNumber) {
//		this.name = name;
//		this.rollNumber = rollNumber;
//		numStudents++;
//	}

//	public Student(String name) {
//		this.name = name;
//		this.rol
//	}
//
//	public Student(int rollNumber) {
//		this.rollNumber = rollNumber;
//	}
//
	public Student() {
		this.rollNumber = numStudents;
	}
	public void print() {
		System.out.println(name + " " + rollNumber);
	}
	public int getRollNumber() {
		return this.rollNumber;
	}
	public static int getNumStudent() {
		return numStudents;
	}

//	public void setRollNumber(int rollNumber) {
//		if(rollNumber <= 0) {
//			return;
//		}
//		System.out.println("this " + this);
//		this.rollNumber = rollNumber;
//	}

}
