package ControleDeFluxo;

public class ForLacos {
	
	public static void main(String[] args) {
		 int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		    for (int i = 0; i < numeros.length; i++) {
		        System.out.println(numeros[i]);
		    }
		    
		  System.out.println("------------------------");  
		    for(int numero:numeros) {
		    	System.out.println(numero);
		    }
	}

}
