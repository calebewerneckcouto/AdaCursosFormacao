package ProgramacaoFuncional;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> imprimirCaixaAlta = nome -> System.out.println(nome.toUpperCase());
		Consumer<String> imprimirCaixaBaixa = nome -> System.out.println(nome.toLowerCase());

		imprimirCaixaAlta.accept("João");
		imprimirCaixaAlta.accept("Maria");
		imprimirCaixaBaixa.accept("João");
		imprimirCaixaBaixa.accept("Maria");
	}

}
