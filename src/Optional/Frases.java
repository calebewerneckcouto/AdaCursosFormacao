package Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Frases {

	public static void main(String[] args) {

		List<String> frase = Arrays.asList("Eu adoro quando um plano dá certo", "Java é uma linguagem versátil",
				"Streams tornam o código mais declarativo", "O Esquadrão Classe A sempre cumpre a missão",
				"Não há nada que não possamos resolver", "Programar é transformar ideias em soluções",
				"A persistência é o caminho do êxito", "Facilitamos o trabalho com boas práticas",
				"O código limpo é fácil de entender e manter",
				"Com organização e estratégia, vencemos qualquer desafio");

		List<String> Nomes = List.of("Calebe", "Rodrigo", "Livia", "Julia");

		Map<String, List<Double>> alunos = Map.of(
                "João", List.of(7.5, 8.0, 9.5),
                "Maria", List.of(6.0, 10.0, 5.5),
                "Pedro", List.of(8.5, 7.0),
                "Ana", List.of(9.0, 6.5)
        );

       double media = alunos.values().stream()
                .flatMap(List::stream)
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
       
       System.out.println("Média dos alunos é: " + media);
       
       System.out.println("--------------------------------------------------");

		System.out.println(
				Nomes.stream().map(c -> c.toUpperCase()).filter(c -> c.startsWith("C")).collect(Collectors.toList()));

		long quantidadeDistintas = frase.stream().distinct().count();

		Set<String> frases = frase.stream().collect(Collectors.toSet());
		
		System.out.println("------------------------------------------------------");

		System.out.print("Quantidade de palavras unicas " + quantidadeDistintas);
		
		System.out.println("------------------------------------------------------");

		System.out.println(" Palavras únicas: " + frases);

	}

}
