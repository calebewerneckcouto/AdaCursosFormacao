package ControleDeFluxo;

public class CondicionaisIf {

	public static void main(String[] args) {
		int nota = 80;
		if (nota >= 70) {
			System.out.println("Aprovado");
		} else if (nota >= 60) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
	}

}
