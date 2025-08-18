package ExpressaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroParesLambda {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(30,25,47,85,88,66,35,12,11,47,41,42,45,46,49,48);

		List<Integer> filtroPares = numeros.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());

		filtroPares.forEach(System.out::println);

	}

}
