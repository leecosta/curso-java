package entities;

public class Rectangle {
	
	public double width;
	public double height;

	public double area() {
		double result = width * height;
		return result;
	}
	
	public double perimeter() {
		double result = (width * 2) + (height * 2);
		return result;
	}
	
	public double diagonal() {
		double result = Math.sqrt((width * width) + (height * height));
		return result;
	}
	
//	public String toString() {
//		return "AREA = " + area()
//			+ "PERIMETER = " + perimeter()
//			+ "DIAGONAL = " + diagonal();
//	}
}


