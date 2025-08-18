package ExpressaoLambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NomesMaisDe5Letras {
	
	
	public static void main(String[] args) {
		
		
		List<String> nomes = Arrays.asList("Cassiane","Rogenildo","Calebe","Fabiana","Leticia","Laura","Livia");
		
		List<String>maiores5Letras = nomes.stream().filter(nome->nome.length()>5).collect(Collectors.toList());
		
		System.out.println(maiores5Letras);
	}

}
