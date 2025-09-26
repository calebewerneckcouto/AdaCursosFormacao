package Stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class StreamPrimitivo {
	
	public static void main(String[] args) {
		 System.out.println("=== EXERCÍCIO 11: Streams de Primitivos ===");
	        
	       
	        System.out.print("Números de 1 a 10: ");
	        IntStream.rangeClosed(1, 10)
	            .forEach(n -> System.out.print(n + " "));
	        System.out.println();
	        
	        
	        IntSummaryStatistics stats = IntStream.rangeClosed(1, 100)
	            .summaryStatistics();
	        System.out.println("Estatísticas (1-100):");
	        System.out.println("  Soma: " + stats.getSum());
	        System.out.println("  Média: " + stats.getAverage());
	        System.out.println("  Min: " + stats.getMin());
	        System.out.println("  Max: " + stats.getMax());
	        System.out.println("  Contagem: " + stats.getCount());
	        
	       
	        List<String> numeros = List.of("1", "2", "3", "4", "5");
	        int somaConvertida = numeros.stream()
	            .mapToInt(Integer::parseInt)
	            .sum();
	        System.out.println("Soma após conversão: " + somaConvertida);
	        System.out.println();
	}

}
