package ProgramacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class CompareToExample {
	public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Carlos", "Ana", "João", "Beatriz"));

        nomes.sort((n1, n2) -> n1.compareTo(n2)); 

        System.out.println("Nomes ordenados: " + nomes);
    }
}
