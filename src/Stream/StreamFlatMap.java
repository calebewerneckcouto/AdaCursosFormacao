package Stream;

import java.util.List;

public class StreamFlatMap {
	public static void main(String[] args) {
		System.out.println("=== EXERCÍCIO 6: FlatMap ===");

		List<List<String>> listaDeListas = List.of(List.of("a", "b"), List.of("c", "d", "e"), List.of("f"),
				List.of("g", "h", "i", "j"));

		System.out.println("Listas originais: " + listaDeListas);

		System.out.print("Lista achatada: ");
		listaDeListas.stream().flatMap(List::stream).forEach(s -> System.out.print(s + " "));
		System.out.println("\n");
	}
}
