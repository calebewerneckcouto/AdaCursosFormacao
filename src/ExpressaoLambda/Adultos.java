package ExpressaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Adultos {
	
	
	public static void main(String[] args) {
		List<Pessoa> pessoas = Arrays.asList(
	            new Pessoa("Ana", 20),
	            new Pessoa("Bruno", 17),
	            new Pessoa("Alice", 25),
	            new Pessoa("Calebe", 37)
	        );
		
		
		List<Pessoa>maior18Anos = pessoas.stream().filter(p->p.getIdade()>=18).collect(Collectors.toList());
		
		
		maior18Anos.forEach(System.out:: println);
	}

}
