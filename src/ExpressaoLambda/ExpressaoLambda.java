package ExpressaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExpressaoLambda {
	
	public static void main(String[] args) {
		
		List<Pessoa> pessoas = Arrays.asList(
	            new Pessoa("Ana", 20),
	            new Pessoa("Bruno", 17),
	            new Pessoa("Alice", 25),
	            new Pessoa("Calebe", 37)
	        );
		
		List<Pessoa> maioresDe18 = pessoas.stream().filter(p->p.idade >18).collect(Collectors.toList());  //Expressao lambda
		
		System.out.println("Maiores de 18 anos");
		
		maioresDe18.forEach(System.out:: println);//imprimir um de cada
		
		List<Pessoa>nomesComA = pessoas.stream().filter(p->p.nome.startsWith("A")).collect(Collectors.toList());
		
		System.out.println("Nomes que começam com a letra A");
		
		nomesComA.forEach(System.out::println);
		
	}

}
