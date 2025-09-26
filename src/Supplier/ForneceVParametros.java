package Supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ForneceVParametros {
	
	public static void main(String[] args) {
		Supplier<Double> numeroAleatorio = Math::random;
		Supplier<List<String>> listaVazia = ArrayList::new;
		System.out.println("Numero aleatorio: " + numeroAleatorio.get());
		System.out.println("Lista vazia: " + listaVazia.get());
		
	}

}
