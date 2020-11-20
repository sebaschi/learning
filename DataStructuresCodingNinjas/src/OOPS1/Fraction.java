package OOPS1;

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) throws DivideByZeroException {
		if(denominator == 0) {
			throw new DivideByZeroException();
		}		//Not Ideal to throw Exception in  Constructor
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}

	private void simplify() {				// simply only is called by the class, we don't want others to call simplify

		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i = 2; i <= smaller; i++){
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	public void print() {
		System.out.println(numerator + "/" + denominator);
	}


	public void increment() {
		numerator = numerator + denominator;		// adding 1 to a fraction boils down to adding the denominator to the numerator and keeping the denominator;
		simplify();

	}

	public Fraction add(Fraction f2) throws DivideByZeroException {

		int f2nom = f2.getNumerator();
		int f2denom = f2.getDenominator();
		int newNom = (this.numerator*f2denom) + (f2nom * this.denominator);
		int newDenom = this.denominator * f2denom;

		Fraction added = new Fraction(newNom, newDenom);
		simplify(added);
		return added;
	}	
// CN version:
	public void addCN(Fraction f2) {
		//First Fraction is the fraction on which the function is called
		// Second Fraction is passed as an argument;
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.denominator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}

	public static Fraction add(Fraction f1, Fraction f2) throws DivideByZeroException {
		int newNum = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		Fraction f3 = new Fraction(newNum, newDeno);
		return f3;
	}

	private void simplify(Fraction frac) {				// simply only is called by the class, we don't want others to call simplify

		int numerator = frac.getNumerator();
		int denominator = frac.getDenominator();
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i = 2; i <= smaller; i++){
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;
	}

	public void subtract(Fraction f2) {
		this.numerator = this.numerator * f2.denominator - f2.numerator * this.denominator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}

	public void mult(Fraction f2) {
		this.numerator = this.numerator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}




	//Getters and Setters

	public void setNumerator(int numerator) {
		this.numerator = numerator;
		simplify();
	}

	public int getNumerator() {
		return numerator;
	}

	public void setDenominator(int denominator) throws DivideByZeroException {
		if(denominator == 0) {
			throw new DivideByZeroException();
		}
		this.denominator = denominator;
		simplify();
	}

	public int getDenominator() {
		return denominator;
	}





}
