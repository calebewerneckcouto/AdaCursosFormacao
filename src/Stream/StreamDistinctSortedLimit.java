package Stream;

import java.util.List;

public class StreamDistinctSortedLimit {
	
	public static void main(String[] args) {
		  System.out.println("=== EXERCÍCIO 5: Distinct, Sorted e Limit ===");
	        
	        List<Integer> numeros = List.of(5, 2, 8, 2, 9, 1, 5, 6, 8, 3);
	        
	        System.out.println("Lista original: " + numeros);
	        
	        System.out.print("Top 5 números únicos em ordem crescente: ");
	        numeros.stream()
	            .distinct()
	            .sorted()
	            .limit(5)
	            .forEach(n -> System.out.print(n + " "));
	        System.out.println("\n");
	}

}
