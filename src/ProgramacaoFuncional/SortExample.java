package ProgramacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class SortExample {
	 public static void main(String[] args) {
	        List<String> nomes = new ArrayList<>(List.of("João", "Maria", "Ana", "Bernardo"));

	        nomes.sort((n1, n2) -> Integer.compare(n1.length(), n2.length()));

	        System.out.println("Ordenados por tamanho: " + nomes);
	    }
}
