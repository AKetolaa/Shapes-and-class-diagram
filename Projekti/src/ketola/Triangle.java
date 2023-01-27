package ketola;

import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {

	private final double a;
	private final double b;
	private final double c;
	private String color = " No color";
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public Triangle() {
		this.a = 1.0;
		this.b = 1.0;
		this.c = 1.0;
	}
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double calculateArea() {
		double p = (a+b+c)/2;
		double tArea = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return tArea;
	}
	
	public double calculatePerimeter() {
		double tP = a+b+c;
		return tP;
	}
	
	public void drawShape() {
		System.out.println("Drawing a triangle with area: "+df2.format(calculateArea())+" and perimeter: "+df2.format(calculatePerimeter())+getColor());
	}

	public boolean setColor(String color) {
		if (color.equalsIgnoreCase(" Color: Red")|| color.equalsIgnoreCase(" Color: Blue")) {
			this.color=color;
			return true;
		}
		return false;
	}

	public String getColor() {
		return color;
	}
}
