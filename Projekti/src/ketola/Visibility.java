package ketola;

public abstract class Visibility {
	
	private boolean inBackground = false;
	public Visibility() {
		
	}
	public void changeVisibility() {
		inBackground = !inBackground;
	}
	public boolean isVisible() {
		return inBackground;
	}
}
