package Stream;

import java.util.stream.Stream;

public class StreamInfinitasLimit {
public static void main(String[] args) {
	  System.out.println("=== EXERCÍCIO 2: Streams Infinitas ===");
      
      
      Stream<Double> randomicos = Stream.generate(Math::random);
      System.out.println("5 números aleatórios:");
      randomicos.limit(5).forEach(System.out::println);
      
     
      Stream<Integer> numerosImpares = Stream.iterate(1, n -> n + 2);
      System.out.print("Primeiros 7 números ímpares: ");
      numerosImpares.limit(7).forEach(n -> System.out.print(n + " "));
      System.out.println();
   
      Stream<Integer> numerosPares = Stream.iterate(2, n -> n < 20, n -> n + 2);
      System.out.print("Números pares menores que 20: ");
      numerosPares.forEach(n -> System.out.print(n + " "));
      System.out.println("\n");
}
}
