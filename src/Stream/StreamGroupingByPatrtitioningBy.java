package Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByPatrtitioningBy {
	
	public static void main(String[] args) {
		  System.out.println("=== EXERCÍCIO 10: Grouping e Partitioning ===");
	        
	        List<String> palavras = List.of("java", "python", "go", "rust", "scala", "kotlin");
	        
	        
	        Map<Integer, List<String>> porTamanho = palavras.stream()
	            .collect(Collectors.groupingBy(String::length));
	        System.out.println("Agrupado por tamanho: " + porTamanho);
	        
	       
	        Map<Boolean, List<String>> particao = palavras.stream()
	            .collect(Collectors.partitioningBy(p -> p.length() > 4));
	        System.out.println("Particionado (tamanho > 4): " + particao);
	        
	       
	        Map<Integer, Long> contagemPorTamanho = palavras.stream()
	            .collect(Collectors.groupingBy(String::length, Collectors.counting()));
	        System.out.println("Contagem por tamanho: " + contagemPorTamanho);
	        System.out.println();
	}

}
