package Stream;

import java.util.List;

public class StreamPeekDebug {
	
	public static void main(String[] args) {
System.out.println("=== EXERCÍCIO 14: Peek para Debug ===");
        
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        long resultado = numeros.stream()
            .peek(n -> System.out.println("Original: " + n))
            .filter(n -> n % 2 == 0)
            .peek(n -> System.out.println("  Após filter (pares): " + n))
            .map(n -> n * n)
            .peek(n -> System.out.println("    Após map (quadrado): " + n))
            .count();
        
        System.out.println("Resultado final: " + resultado + " elementos\n");
    
	}

}
