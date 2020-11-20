package oopPart1;

public class Wall {
	
	private double height;
	private double width;
	
	public Wall() {
		this(0.0,0.0);
	}
	
	public Wall(double width, double height) {
		this.height = height;
		this.width = width;
		if(height < 0) {
			this.height = 0.0;
		} 
		if(width < 0) {
			this.width = 0.0;
		}
	
	}
	
	// setters
	public void setHeight(double hight) {
		if(hight < 0.0) {
			this.height = 0.0;
		} else {	
			this.height = hight;
		}
	}
	public void setWidth(double width) {
		if(width < 0) {
			this.width = 0;
		} else {
			this.width = width;
		}
	}
	//getters
	public double getHeight() {
		return this.height;
	}
	public double getWidth() {
		return this.width;
	}
	public double getArea() {
		return this.height*this.width;
	}

}
