package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeline {
	
	public static void main(String[] args) {
System.out.println("=== EXERCÍCIO 13: Pipeline Complexo ===");
        
        List<String> textos = List.of(
            "Java é uma linguagem de programação",
            "Streams facilitam o processamento de dados",
            "Programação funcional em Java",
            "Collect e reduce são operações terminais",
            "Filter e map são operações intermediárias"
        );
        
        
        List<String> palavrasProcessadas = textos.stream()
            .flatMap(texto -> Arrays.stream(texto.toLowerCase().split("\\s+")))
            .filter(palavra -> palavra.length() > 3)
            .filter(palavra -> palavra.matches("[a-záêîôç]+")) 
            .distinct()
            .sorted(Comparator.comparing(String::length)
                   .thenComparing(String::compareTo))
            .collect(Collectors.toList());
        
        System.out.println("Palavras processadas:");
        palavrasProcessadas.forEach(System.out::println);
        
      
        IntSummaryStatistics statsComprimento = palavrasProcessadas.stream()
            .mapToInt(String::length)
            .summaryStatistics();
        
        System.out.println("\nEstatísticas de comprimento das palavras:");
        System.out.println("Média: " + String.format("%.2f", statsComprimento.getAverage()));
        System.out.println("Min: " + statsComprimento.getMin());
        System.out.println("Max: " + statsComprimento.getMax());
        System.out.println();
	}

}
