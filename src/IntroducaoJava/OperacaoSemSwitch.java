package IntroducaoJava;

import java.util.Scanner;

public class OperacaoSemSwitch {

	public static void main(String[] args) {
		// Operação sem switch

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o Primeiro Valor:");
		Double n1 = scanner.nextDouble();

		System.out.println("Informe o Segundo Valor:");
		Double n2 = scanner.nextDouble();

		System.out.println("Qual operação deseja fazer?: + - / * ");
		char operacao = scanner.next().charAt(0);

		if (operacao == '+') {
			System.out.println("Resultado: " + (n1 + n2));
		} else if (operacao == '-') {
			System.out.println("Resultado: " + (n1 - n2));
		} else if (operacao == '*') {
			System.out.println("Resultado: " + (n1 * n2));
		} else if (operacao == '/') {
			if (n2 == 0) {
				System.out.println("Erro: divisão por zero não é permitida.");
			} else {
				System.out.println("Resultado: " + (n1 / n2));
			}
		} else {
			System.out.println("Operador inválido!");
		}

		scanner.close();
	}
}
