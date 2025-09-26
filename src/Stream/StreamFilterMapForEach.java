package Stream;

import java.util.List;

public class StreamFilterMapForEach {
	
	public static void main(String[] args) {
		 System.out.println("=== EXERCÍCIO 4: Filter, Map e ForEach ===");
	        
	        List<String> linguagens = List.of("java", "javascript", "python", "julia", "go", "ruby");
	        
	        System.out.println("Linguagens que começam com 'j' (em maiúsculas):");
	        linguagens.stream()
	            .filter(lang -> lang.startsWith("j"))
	            .map(String::toUpperCase)
	            .forEach(System.out::println);
	        System.out.println();
	}

}
