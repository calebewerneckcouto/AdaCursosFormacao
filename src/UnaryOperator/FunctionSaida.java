package UnaryOperator;

import java.util.function.UnaryOperator;

public class FunctionSaida {
	
	public static void main(String[] args) {
		UnaryOperator<String> maiusculas = String::toUpperCase;
		UnaryOperator<Integer> quadrado = n -> n * n;
		
			System.out.println(maiusculas.apply("java"));
			System.out.println(quadrado.apply(5));
	}

}
