package SegregacaoInterface.Veiculos;

public class Main {
	public static void main(String[] args) {
		Carro c = new Carro();
		Aviao a = new Aviao();
		Barco b = new Barco();

		c.dirigir();
		a.voar();
		b.navegar();
	}
}
