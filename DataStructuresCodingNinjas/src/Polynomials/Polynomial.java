package Polynomials;

public class Polynomial {


	int[] poly;
	int degree;

	public Polynomial(){
		poly = new int[100];
		degree = 0;
	}

	public void setCoefficient(int deg, int coeff){

		while(deg >= poly.length) {
			doubleCapacity();
		}
		if(deg > degree) {
			degree = deg;
		}
		poly[deg] = coeff;

	}


	public void print(){
		for(int i = 0; i <= this.degree; i++) {
			if(poly[i] == 0) {
				continue;
			} else {
				System.out.print(poly[i] + "x" + i + " ");
			}
		}
	}



	public Polynomial add(Polynomial p2){

		int longer = this.degree >= p2.degree ? this.degree : p2.degree;
		Polynomial newP = new Polynomial();
		int newCoeff;
		while(longer > newP.poly.length) {
			newP.doubleCapacity();
		}
		for(int i = 0; i <= longer; i++) {
			if(this.poly[i] == 0 && p2.poly[i] == 0) {
				continue;
			}
			newCoeff = this.poly[i]+ p2.poly[i];
			newP.setCoefficient(i, newCoeff);
		}

		return newP;

	}


	public Polynomial subtract(Polynomial p2){
		int longer = this.degree >= p2.degree ? this.degree : p2.degree;
		Polynomial newP = new Polynomial();
		int newCoeff;
		while(longer > newP.poly.length) {
			newP.doubleCapacity();
		}
		for(int i = 0; i <= longer; i++) {
			if(this.poly[i] == 0 && p2.poly[i] == 0) {
				continue;
			}
			newCoeff = this.poly[i]  - p2.poly[i];
			newP.setCoefficient(i, newCoeff);
		}

		return newP;
	}


	public Polynomial multiply(Polynomial b){

		Polynomial a = this;
		Polynomial c = new Polynomial();
		while(c.poly.length <= a.poly.length + b.poly.length) {
			c.doubleCapacity();
		}
		for( int i = 0; i <= a.degree; i++ ) {
			for( int j = 0; j <= b.degree; j++ ) {
				c.setCoefficient((i+j), (a.poly[i] * b.poly[j] + c.poly[i+j]));
			}
		}

		return c;
	}

	public void doubleCapacity() {
		int temp[] = poly;
		poly = new int[2 * temp.length];
		for(int i = 0; i < temp.length; i++) {
			poly[i] = temp[i];
		}
	}

}
