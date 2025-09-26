package BiFunction;

import java.util.function.BiFunction;

public class DoisResultados {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> soma = (a, b) -> a + b;
		BiFunction<Integer, Integer, Integer> multiplicacao = (a, b) -> a * b;
		BiFunction<Integer, Integer, Integer> dividir = (a, b) -> a/b;
		BiFunction<Integer, Integer, Integer> subtrair = (a, b) -> a - b;
		
		BiFunction<Integer, Integer, String> resultadoFinal = (a, b) -> "Soma: " + soma.apply(a, b)
				+ ", Multiplicação: " + multiplicacao.apply(a, b)+", Divisão: " + dividir.apply(a, b)+", Subtracao: " + subtrair.apply(a, b);
		System.out.println(resultadoFinal.apply(3, 5));
	}

}
