package Stream;

import java.util.List;

public class StreamAllmatchAnyMatchNoneMatch {
	
	public static void main(String[] args) {
System.out.println("=== EXERCÍCIO 7: Match Operations ===");
        
        List<Integer> numeros = List.of(2, 4, 6, 8, 10);
        List<String> palavras = List.of("Java", "Python", "C++", "Go");
        
       
        boolean todosPares = numeros.stream().allMatch(n -> n % 2 == 0);
        System.out.println("Todos os números são pares? " + todosPares);
        
       
        boolean contemJava = palavras.stream().anyMatch(p -> p.contains("Java"));
        System.out.println("Alguma palavra contém 'Java'? " + contemJava);
        
        
        boolean nenhumaComNumeros = palavras.stream()
            .noneMatch(p -> p.matches(".*\\d.*"));
        System.out.println("Nenhuma palavra contém números? " + nenhumaComNumeros);
        System.out.println();
	}

}
