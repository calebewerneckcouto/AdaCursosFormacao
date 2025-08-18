package StringBuilder;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        StringBuilder sb = new StringBuilder(palavra);
        String invertida = sb.reverse().toString();

        if (palavra.equalsIgnoreCase(invertida)) {
            System.out.println("É PALÍNDROMO");
        } else {
            System.out.println("NÃO é Palíndromo");
        }

        sc.close();
    }
}
