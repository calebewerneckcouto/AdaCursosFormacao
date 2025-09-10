package Solid.I;

public class Main {
	/*👉 Problema: Classes são forçadas a implementar métodos que não usam.*/
	
	
   public static void main(String[] args) {
		Trabalhador trabalhador = new Engenheiro();
		trabalhador.trabalhar();

		Estudante estudante = new Estudante();
		estudante.estudar();
}
}
