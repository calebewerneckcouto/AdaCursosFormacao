package LeitorManuseioArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorCSV {
    public static void main(String[] args) {
        // Caminho relativo dentro do projeto
        String arquivo = "src/LeitorManuseioArquivos/pessoas.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            boolean primeiraLinha = true;

            System.out.println("📂 Dados do arquivo CSV:\n");

            while ((linha = br.readLine()) != null) {
                
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] partes = linha.split(",");
                System.out.println("Nome: " + partes[0] 
                                 + " | Idade: " + partes[1] 
                                 + " | Email: " + partes[2]);
            }

        } catch (IOException e) {
            System.out.println("❌ Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
