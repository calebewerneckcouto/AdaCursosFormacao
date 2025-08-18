package ControleDeFluxo;

import java.util.Random;

public class While {

    public static void main(String[] args) {
        // Gera um número aleatório entre 0 e 9
        int num = new Random().nextInt(10);

        // Contador para registrar quantas tentativas foram necessárias
        int cont = 0;

        // Enquanto o número for ímpar (num % 2 != 0)
        while (num % 2 != 0) {
            // Gera um novo número aleatório
            num = new Random().nextInt(10);

            // Incrementa o contador de tentativas
            cont++;
        }

        // Quando sair do while, significa que 'num' é par
        // Imprime o número par encontrado e a quantidade de interações necessárias
        System.out.printf("%d é um número par. Foram necessárias %d interações.%n", num, cont);
    }
}
