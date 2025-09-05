package LiskovSubstitution.Shape;

public class Square implements Shape {
	private int side;

	public Square(int side) {
		this.side = side;
	}


	public double getSide() {
		return side;
	}
	@Override
	public int getArea() {
		return (side * side);
	}

}
