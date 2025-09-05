package LiskovSubstitution.Shape;

public class Rectangle implements Shape {

	protected int width;
	protected int height;
	
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public int getArea() {
		return width * height;
	}

}
