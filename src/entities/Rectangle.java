package entities;

public class Rectangle {
	public Double width;
	public Double height;
	
	public Double area() {
		return width * height;
	}
	
	public Double perimeter() {
		return 2 * (width + height);
	}
	
	public Double diagonal() {
		double resultadoWidth = Math.pow(width, 2);
		double resultadoHeight = Math.pow(height, 2);
		return Math.sqrt((resultadoWidth) + (resultadoHeight));
	}
	
}
