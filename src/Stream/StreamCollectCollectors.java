package Stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectCollectors {
	
	public static void main(String[] args) {
		 System.out.println("=== EXERCÍCIO 9: Collectors ===");
	        
	        List<String> frutas = List.of("maça", "banana", "laranja", "uva", "maça", "banana");
	        
	      
	        List<String> frutasUnicas = frutas.stream()
	            .distinct()
	            .collect(Collectors.toList());
	        System.out.println("Frutas únicas (List): " + frutasUnicas);
	        
	       
	        Set<String> frutasSet = frutas.stream()
	            .collect(Collectors.toSet());
	        System.out.println("Frutas únicas (Set): " + frutasSet);
	        
	        
	        String frutasString = frutas.stream()
	            .distinct()
	            .collect(Collectors.joining(", "));
	        System.out.println("Frutas como string: " + frutasString);
	        
	        
	        long quantidade = frutas.stream().collect(Collectors.counting());
	        System.out.println("Quantidade total: " + quantidade);
	        System.out.println();
	}

}
