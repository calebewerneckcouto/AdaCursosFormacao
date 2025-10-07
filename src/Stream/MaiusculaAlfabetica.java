package Stream;

import java.util.Arrays;
import java.util.List;

public class MaiusculaAlfabetica {
	
	public static void main(String[] args) {
		List<String>lista = Arrays.asList("Bruno", "Ana", "Beatriz", "Carlos", "Bianca", "Daniel");

		 lista.stream()
         .map(nome -> nome.toUpperCase())
         .filter(nome -> !nome.startsWith("A"))
         .sorted((a, b) -> b.compareTo(a)) 
         .forEach(System.out::println);
}

}
