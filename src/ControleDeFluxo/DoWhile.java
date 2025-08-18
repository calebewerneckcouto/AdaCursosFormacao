package ControleDeFluxo;

import java.util.Random;

public class DoWhile {
public static void main(String[] args) {
	 Random random = new Random();
	    int num = 0;
	    int cont = 0;
	    do {
	        num = random.nextInt(10);
	        cont++;
	    } while (num % 2 != 0);
	    System.out.printf("%d é um número par. Foram necessárias %d interações.%n", num, cont);
	}
}

