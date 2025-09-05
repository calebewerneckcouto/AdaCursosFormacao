package LiskovSubstitution.Shape;

public class Main {
	public static void main(String[] args) {
		Shape r = new Rectangle(10, 5);
        Shape s = new Square(4);

        System.out.println("Área retângulo: " + r.getArea());
        System.out.println("Área quadrado: " + s.getArea());
	}
}
