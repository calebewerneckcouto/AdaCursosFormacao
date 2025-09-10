package Solid.L;

public class Main {
	/*👉 Problema: Subclasse não respeita a classe pai.*/
	public static void main(String[] args) {
		Ave ave = new Pinguim();
		ave.voar(); 
	}
}
