package ketola;

public class ShapeAdapter extends Visibility implements ShapeBasic {
	
	
	
	private ShapeSpecial shapeSpecial;
	
	public ShapeAdapter(ShapeSpecial shapeSpecial) {
		this.shapeSpecial=shapeSpecial;
	}
	public void draw() {
		shapeSpecial.drawShape();
	}
	public void grow() {
		System.out.println(printText()+", cannot grow");
	}
	public String printText() {
		if (shapeSpecial instanceof Triangle) {
			return "Triangle";
		}
		else if (shapeSpecial instanceof ShapeDiamond) {
			return "ShapeDiamond";
		}
		else {
			return "Wrong kind of shape - not supported";
		}
	}
	
}
