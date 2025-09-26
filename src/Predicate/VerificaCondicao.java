package Predicate;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import java.util.function.Predicate;

public class VerificaCondicao {
	public static <T> void main(String[] args) {
		Predicate<Integer> isPar = n -> n % 2 == 0;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<Integer> isMaiorQue10 = n -> n > 10;
		Predicate<LocalDate> maiordeidade = dataNascimento -> {
			int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
			return idade >= 18;
		};
		
		
		
		 Function<Double, Double> celsiusParaFahrenheit = celsius -> (celsius * 9 / 5) + 32;

	        
	        System.out.println(celsiusParaFahrenheit.apply(0.0));    
	        System.out.println(celsiusParaFahrenheit.apply(100.0));  

		LocalDate data2005 = LocalDate.of(2005, 6, 15);
		LocalDate data2000 = LocalDate.of(2000, 1, 1);
		LocalDate data2010 = LocalDate.of(2010, 12, 31);

		System.out.println("Nascimento 2005 é maior de idade? " + maiordeidade.test(data2005));
		System.out.println("Nascimento 2000 é maior de idade? " + maiordeidade.test(data2000));
		System.out.println("Nascimento 2010 é maior de idade? " + maiordeidade.test(data2010));

		System.out.println("5 é par? " + isPar.test(5));
		System.out.println("10 é par? " + isPar.test(10));
		System.out.println("String vazia? " + isEmpty.test(""));
		System.out.println("String 'Java' vazia? " + isEmpty.test("Java"));
		System.out.println("15 é maior que 10? " + isMaiorQue10.test(15));
	}
}
