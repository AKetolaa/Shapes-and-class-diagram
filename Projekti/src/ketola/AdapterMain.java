package ketola;

public class AdapterMain {

	public AdapterMain() {
		
	}
	public static void main(String[] args) {
		
		
		Drawing drawing = new Drawing();
		
		drawing.addBasicShape(new Rectangle());
		
		Rectangle rec1 =new Rectangle();
		drawing.addBasicShape(rec1);
		rec1.changeVisibility();
		
		Circle c1=new Circle();
		drawing.addBasicShape(c1);
		c1.changeVisibility();
		
		Triangle t1 = new Triangle();
		t1.setColor(" Color: Red");
		drawing.addBasicShape(new ShapeAdapter(t1));
		
		ShapeDiamond d1 = new ShapeDiamond();
		d1.setColor(" Color: Blue");
		drawing.addBasicShape(new ShapeAdapter(d1));
		
		ShapeDiamond d2 = new ShapeDiamond();
		d2.setColor(" Color: Red");
		ShapeAdapter ad=new ShapeAdapter(d2);
		ad.changeVisibility();
		drawing.addBasicShape(ad);
		
		Triangle t2 = new Triangle();
		t2.setColor(" Color: Blue");
		ShapeAdapter at = new ShapeAdapter(t2);
		at.changeVisibility();
		drawing.addBasicShape(at);
		
		BrushStroke b1 = new BrushStroke();
		b1.changeVisibility();
		drawing.addBasicShape(b1);
		
		BrushStroke b2 = new BrushStroke();
		drawing.addBasicShape(b2);
		
		drawing.draw();
		drawing.grow();
		drawing.showVisibility();
	}

}
