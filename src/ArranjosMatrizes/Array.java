package ArranjosMatrizes;

public class Array {
	
	public static void main(String[] args) {
		int[]numeros = new int [5];
		
		numeros[0]=10;
		numeros[1]=20;
		numeros[2]=30;
		numeros[3]=40;
		numeros[4]=50;
		
		System.out.println("Primeiro número: " + numeros[0]);
		System.out.println("Ultimo númeoro: " + numeros[4]);
		
		 System.out.println("Todos os números:");
		for(int numero:numeros) {
			System.out.println(numero);
		}
	}

}
