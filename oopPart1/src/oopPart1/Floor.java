package oopPart1;

public class Floor {
	
	private double width;
	private double length;
	
	public Floor(double w, double h) {
		this.width = w;
		this.length = h;
		if(w < 0.0) {
			this.width = 0.0;
		}
		if(h < 0.0) {
			this.length = 0.0;
		}
	}
	
	public double getArea() {
		return this.width*this.length;
	}

}
