package oopPart1;

import java.util.*;

public class Point {
	
	private int x;
	private int y;
	
	//constructors
	public Point() {
		this(0,0);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//getters
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	//setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	//methods
	public double distance(Point p) {
		return Math.sqrt(Math.abs(((double)(((p.x - this.x)*(p.x - this.x)) + ((p.y -this.y) * (p.y - this.y))))));
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.abs(((double) (((x - this.x)*(x - this.x)) + ((y - this.y)*(y - this.y))))));
	}
	public double distance() {
		return Math.sqrt(Math.abs(((double)(this.x*this.x + this.y * this.y))));
	}

}
