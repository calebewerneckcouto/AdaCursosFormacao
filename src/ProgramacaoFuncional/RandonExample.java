package ProgramacaoFuncional;

import java.util.Random;
import java.util.function.Supplier;

public class RandonExample {
	
	public static void main(String[] args) {
		
		Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100);
		
		System.out.println( "O numero aleatorio escolhido foi: "+ numeroAleatorio.get());
	}

}
