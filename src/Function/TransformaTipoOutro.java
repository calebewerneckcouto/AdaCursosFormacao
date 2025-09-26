package Function;

import java.util.function.Function;

public class TransformaTipoOutro {
public static void main(String[] args) {
	Function<String, Integer> stringParaInteiro = Integer::parseInt;
	Function<Integer, String> inteiroParaString = Object::toString;
		System.out.println(stringParaInteiro.apply("1234") + 100);
		System.out.println(inteiroParaString.apply(5678) + 100);
}
}
