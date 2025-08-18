package IntroducaoJava;

import java.util.Scanner;

public class OperacaoComSwitch {

	// Operação com Switch

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Digite o primeiro número:");
			double num1 = input.nextDouble();

			System.out.println("Digite o segundo número:");
			double num2 = input.nextDouble();

			System.out.println("Digite a operação (+, -, *, /) ou 'sair' para encerrar:");
			String operador = input.next();

			if (operador.equalsIgnoreCase("sair")) {
				System.out.println("Encerrando o programa...");
				break;
			}

			double resultado = 0;
			boolean operacaoValida = true;

			switch (operador) {
			case "+":
				resultado = num1 + num2;
				break;
			case "-":
				resultado = num1 - num2;
				break;
			case "*":
				resultado = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("Erro: divisão por zero não é permitida.");
					operacaoValida = false;
				} else {
					resultado = num1 / num2;
				}
				break;
			default:
				System.out.println("Operador inválido!");
				operacaoValida = false;
			}

			if (operacaoValida) {
				System.out.printf("Resultado: %.2f%n", resultado);
			}
		}

		input.close();
	}

}
