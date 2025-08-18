package StringBuilder;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = scanner.nextLine();
		
		StringBuilder sb = new StringBuilder(palavra);
		String invertida = sb.reverse().toString();
		
		System.out.println(invertida);
		
		scanner.close();

	}

}
