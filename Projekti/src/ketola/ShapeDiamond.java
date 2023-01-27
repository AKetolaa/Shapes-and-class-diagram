package ketola;

import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {

	private final double a;
	private final double b;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private String color = " No color";
	
	public ShapeDiamond() {
		this.a = 1.0;
		this.b = 1.0;
		
	}
	public ShapeDiamond(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double calculateArea() {
		double dArea=a*b;
		return dArea;
	}
	public double calculatePerimeter() {
		double dP=a+a+b+b;
		return dP;
	}
	public void drawShape() {
		System.out.println("Drawing a diamond shape with area: "+df2.format(calculateArea())+ " and perimeter: "+df2.format(calculatePerimeter())+getColor());
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
