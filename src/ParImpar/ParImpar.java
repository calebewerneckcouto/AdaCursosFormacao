package ParImpar;

import java.util.ArrayList;

public class ParImpar {

	public static void main(String[] args) {

		int[] numeros = { 5, 6, 8, 16, 18, 89, 78, 55 };

		ArrayList<Integer> pares = new ArrayList<>();
		ArrayList<Integer> impares = new ArrayList<>();

		int par = 0;
		int impar = 0;

		for (int x = 0; x < numeros.length; x++) {
			if (numeros[x] % 2 == 0) {
				par++;
				pares.add(numeros[x]);
			} else {
				impar++;
				impares.add(numeros[x]);
			}
		}

		

		System.out.println("Há " + par + " numeros par(es) e há " + impar + " numero impar(es)");
		System.out.println("Numeros pares: " +pares);
		System.out.println("Numeros impares: " +impares);

	}

}
