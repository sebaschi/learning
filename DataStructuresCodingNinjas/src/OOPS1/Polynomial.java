package OOPS1;

public class Polynomial {
	
	DynamicArray coefficients;
	
	public Polynomial() {
		coefficients = new DynamicArray();
	}

	public void setCoefficient(int deg, int coeff) {

		if(deg >= coefficients.size()) {
			for(int i = coefficients.size(); i < deg; i++) {
				coefficients.add(0);
			}
		}
		coefficients.set(deg, coeff);
		
	}
	
	public int getCoefficients(int deg) {
		return coefficients.get(deg);
	}
	
	public int degree() {
		return coefficients.size();
	}
	
	public void print() {
		if(coefficients.isEmpty()) {
			return;
		} else {
			for(int i = 0; i < coefficients.size()-1; i++) {
				System.out.print(coefficients.get(i) + "x" + i + " ");
			}
		}
		
	}
	
	public void add(Polynomial p) {
		for (int i = 0; i < p.degree(); i++) {
			int newCoeff = this.getCoefficients(i) + p.getCoefficients(i);
			coefficients.set(i, newCoeff);
		}
	}
	
	
	

}
