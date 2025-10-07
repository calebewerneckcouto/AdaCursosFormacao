package Optional;

import java.util.List;

public class StringParaASCII {
	

	
	public static void main(String[] args) {
		List<String> caracteres = List.of("Java", "Python", "JavaScript", "C++", "Ruby");	
		
		caracteres.stream()
        .flatMapToInt(String::chars)
        .forEach(ascii -> 
            System.out.printf("Caractere: %c | ASCII: %d%n", (char) ascii, ascii)
        );
}
	}


