package StringBuilder;

import java.util.Scanner;

public class SubstituirCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String texto = sc.nextLine();

        StringBuilder sb = new StringBuilder(texto);

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                sb.setCharAt(i, '*');
            }
        }

        System.out.println("Frase sem vogais: " + sb.toString());

        sc.close();
    }
}
