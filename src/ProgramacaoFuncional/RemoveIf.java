package ProgramacaoFuncional;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {
	public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Ana", "Pedro", "Jo", "Carla", "Lu"));

        nomes.removeIf(nome -> nome.length() < 4);

        System.out.println("Nomes com 4 letras ou mais: " + nomes);
    }
}
