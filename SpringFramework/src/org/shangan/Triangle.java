package org.shangan;

public class Triangle {
	
	private Integer X;
	private Integer Y;
	
	public Integer getX() {
		return X;
	}
	
	public Triangle(Integer x, Integer y) {
		this.X = x;
		this.Y = y;
	}

	public void setX(Integer x) {
		X = x;
	}

	public Integer getY() {
		return Y;
	}

	public void setY(Integer y) {
		Y = y;
	}

	public void draw() {
		System.out.println("Triangle Draw Method");
		System.out.println("Point X:" + this.getX() + " Y: "+this.getY());
	}

}
