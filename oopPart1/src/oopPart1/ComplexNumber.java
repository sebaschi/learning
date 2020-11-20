package oopPart1;

public class ComplexNumber {
	
	private double real;
	private double imaginary;

	public ComplexNumber(double r, double i) {
		this.real = r;
		this.imaginary = i;
	}
	
	// getter
	public double getReal() {
		return this.real;
	}
	public double getImaginary() {
		return this.imaginary;
	}
	
	//methods
	public void add(double r, double i) {
		this.real += r;
		this.imaginary += i;
	}
	public void add(ComplexNumber c) {
		this.real += c.real;
		this.imaginary += c.imaginary;
		
	}
	public void subtract(double r, double i) {
		this.real -= r;
		this.imaginary -= i;
	}
	public void subtract(ComplexNumber c) {
		this.real -= c.real;
		this.imaginary -= c.imaginary;
	}
}
