package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class rectangle {
	
	/**
	 * @author logan
	 * instance variables
	 */
	private double length;
	private double width;
	
	/**
	 * @author logan
	 * constructor 
	 */
	public rectangle (double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double area (double height, double width) {
		double rectangleArea = 0;
		rectangleArea = height * width;
		return rectangleArea;
	}
	
	public double perimeter (double height, double width) {
		double rectanglePerimeter = 0;
		rectanglePerimeter = (height * 2) + (width * 2);
		return rectanglePerimeter;
	}
	
	public void ifSquare(double height, double width) {
		if (height == width) {
			System.out.println("this is a square");
		}
	}
	
	public void draw (double height, double width, double halfWidth, double halfHeight) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(width, height, halfWidth, halfHeight);
		//draw(width, height, halfWidth, halfHeight);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double firstHeight = Math.random()
	}

}
