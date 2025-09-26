package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamOperacoesTerminais {

	public static void main(String[] args) {
		System.out.println("=== EXERCÍCIO 3: Operações Terminais ===");

		List<String> palavras = List.of("programacao", "java", "streams", "codigo", "a");

		
		long quantidade = palavras.stream().count();
		System.out.println("Quantidade de palavras: " + quantidade);

		
		Optional<String> menorPalavra = palavras.stream().min(Comparator.comparing(String::length));
		menorPalavra.ifPresent(p -> System.out.println("Menor palavra: " + p));

		Optional<String> maiorPalavra = palavras.stream().max(Comparator.comparing(String::length));
		maiorPalavra.ifPresent(p -> System.out.println("Maior palavra: " + p));

	
		Optional<String> primeira = palavras.stream().findFirst();
		primeira.ifPresent(p -> System.out.println("Primeira palavra: " + p));

		Optional<String> qualquer = palavras.stream().findAny();
		qualquer.ifPresent(p -> System.out.println("Qualquer palavra: " + p));
		System.out.println();
	}

}
