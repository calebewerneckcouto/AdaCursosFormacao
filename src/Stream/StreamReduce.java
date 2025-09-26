package Stream;

import java.util.List;
import java.util.Optional;

public class StreamReduce {
	
	public static void main(String[] args) {
System.out.println("=== EXERCÍCIO 8: Reduce ===");
        
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<String> palavras = List.of("Java", "é", "muito", "legal");
        
     
        int soma = numeros.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Soma dos números: " + soma);
        
       
        int produto = numeros.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Produto dos números: " + produto);
        
        
        String frase = palavras.stream().reduce("", (a, b) -> a + " " + b).trim();
        System.out.println("Frase concatenada: '" + frase + "'");
       
        Optional<Integer> maior = numeros.stream().reduce(Integer::max);
        maior.ifPresent(n -> System.out.println("Maior número: " + n));
        System.out.println();
	}

}
