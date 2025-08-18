package ContadorVogaisConsoantes;

import java.util.Scanner;

public class ContadorVogaisConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vogal = 0;
        int consoante = 0;

        System.out.println("Informe uma frase ou palavra: ");
        String palavra = scanner.nextLine();

        StringBuilder sb = new StringBuilder(palavra);

        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);

           
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vogal++;
                } else {
                    consoante++;
                }
            }
        }

        System.out.println("Há: " + vogal + " vogais e " + consoante + " consoantes");

        scanner.close();
    }
}
