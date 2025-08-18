package LeitorManuseioArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscreverDados {
    public static void main(String[] args) {
        String arquivo = "src/LeitorManuseioArquivos/pessoas.csv";
        Scanner sc = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivo, true))) {

            // Coletar dados do usuário
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();
            sc.nextLine(); // consumir a quebra de linha

            System.out.print("Digite o email: ");
            String email = sc.nextLine();

            // Escrever no arquivo CSV
            writer.println(nome + "," + idade + "," + email);

            System.out.println("✅ Dados escritos com sucesso no CSV!");

        } catch (IOException e) {
            System.out.println("❌ Erro ao escrever no arquivo: " + e.getMessage());
        }

        sc.close();
    }
}
