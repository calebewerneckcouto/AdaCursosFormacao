package Stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamsFinita {
public static void main(String[] args) {
	
	        System.out.println("=== EXERCÍCIO 1: Criação de Streams Finitas ===");
	        
	     
	        Stream<String> streamVazia = Stream.empty();
	        System.out.println("Stream vazia - elementos: " + streamVazia.count());
	    
	        Stream<Integer> unicoElemento = Stream.of(42);
	        System.out.print("Stream único elemento: ");
	        unicoElemento.forEach(System.out::println);
	        
	     
	        Stream<String> multiplosElementos = Stream.of("Java", "Python", "JavaScript");
	        System.out.print("Stream múltiplos elementos: ");
	        multiplosElementos.forEach(s -> System.out.print(s + " "));
	        System.out.println();
	       
	        
	        List<String> lista = List.of("Apple", "Banana", "Cherry");
	        Stream<String> streamDaLista = lista.stream();
	        System.out.print("Stream da lista: ");
	        streamDaLista.forEach(s -> System.out.print(s + " "));
	        System.out.println("\n");
	    }
}

