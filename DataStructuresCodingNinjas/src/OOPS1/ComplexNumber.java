package OOPS1;

public class ComplexNumber {

	int real;
	int imaginary;

	public ComplexNumber(int r, int i) {
		this.real = r;
		this.imaginary = i;
	}

	public void print() {
		if(this.imaginary >= 0) {
			System.out.println(this.real + " + " + "i" + this.imaginary);
		}else {
			int neg = -this.imaginary;
			System.out.println(this.real + " - " + "i" + neg);
		}
	}

	public void setReal(int r) {
		this.real = r;
	}

	public void setImaginary(int i) {
		this.imaginary = i;
	}

	public void add(ComplexNumber z) {
		this.real = this.real + z.real;
		this.imaginary = this.imaginary + z.imaginary;
	}

	public void multiply(ComplexNumber z) {
		int r = this.real;
		this.real = (this.real * z.real) - (this.imaginary * z.imaginary);
		this.imaginary = (r * z.imaginary) + (this.imaginary * z.real);
	}

	public static ComplexNumber add(ComplexNumber z1, ComplexNumber z2) {
		int newReal = z1.real + z2.real;
		int newImaginary = z1.imaginary + z2.imaginary;
		ComplexNumber z3 = new ComplexNumber(newReal, newImaginary);
		return z3;
	}
}