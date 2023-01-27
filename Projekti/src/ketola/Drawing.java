package ketola;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
	
	List<ShapeBasic> shapeBasic = new ArrayList<ShapeBasic>();
	int counter=1;
	
	public Drawing() {
		
	}
	public void addBasicShape(ShapeBasic shape) {
		shapeBasic.add(shape);
	}
	public List<ShapeBasic> getBasicShapes(){
		return new ArrayList<ShapeBasic>(shapeBasic);
	}
	public void draw() {
		if (shapeBasic.isEmpty()) {
			System.out.println("Nothing to draw");
		} 
		else {
			shapeBasic.stream().forEach(shapeBasic -> shapeBasic.draw());
		}
	}
	public void grow() {
		if (shapeBasic.isEmpty()) {
			System.out.println("Nothing to resize");
		} 
		else {
			shapeBasic.stream().forEach(shapeBasic -> shapeBasic.grow());
		}
	}
	public void showVisibility() {
		if (shapeBasic.isEmpty()) {
			System.out.println("Nothing to show");
			}
		else 
		{
			shapeBasic.stream().forEach(shapeBasic ->  {
				if(shapeBasic.isVisible()) {
					System.out.println(+counter +". Shape is in the background: "+shapeBasic.printText());
					counter=counter+1;
				}
				else {
					System.out.println(+counter +". Shape is visible: "+shapeBasic.printText());
					counter=counter+1;
					}
			});
		}
	}
}	

