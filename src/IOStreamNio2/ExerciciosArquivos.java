package IOStreamNio2;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;
import static java.nio.file.StandardCopyOption.*;

public class ExerciciosArquivos {

    // Exercício 1: Informações do arquivo
    public static void exercicio1_infoArquivo(String caminho) {
        File file = new File(caminho);
        if (file.exists()) {
            System.out.println("Caminho absoluto: " + file.getAbsolutePath());
            System.out.println("É diretório? " + file.isDirectory());
            System.out.println("Nome do arquivo: " + file.getName());
            System.out.println("Tamanho: " + file.length() + " bytes");
            System.out.println("Última modificação: " + file.lastModified());
        } else {
            System.out.println("Arquivo não encontrado.");
        }
    }

    // Exercício 2: Listar arquivos .txt no diretório
    public static void exercicio2_listarArquivosTxt(String dir) throws IOException {
        Path path = Path.of(dir);
        if (!Files.exists(path) || !Files.isDirectory(path)) {
            System.out.println("Diretório inválido.");
            return;
        }

        try (Stream<Path> stream = Files.list(path)) {
            stream.filter(p -> p.toString().endsWith(".txt"))
                  .forEach(p -> {
                      try {
                          System.out.printf("Arquivo: %s (%d bytes)%n", 
                              p.getFileName(), Files.size(p));
                      } catch (IOException e) {
                          System.out.println("Erro ao obter tamanho: " + p);
                      }
                  });
        }
    }

    // Exercício 3: Ler arquivo com InputStream
    public static void exercicio3_lerArquivo(String caminho) {
        try (InputStream is = new FileInputStream(caminho);
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {

            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura: " + e.getMessage());
        }
    }

    // Exercício 4: Copiar arquivo com REPLACE_EXISTING
    public static void exercicio4_copiarArquivo(String origemStr, String destinoStr) {
        Path origem = Path.of(origemStr);
        Path destino = Path.of(destinoStr);

        try {
            Files.copy(origem, destino, REPLACE_EXISTING);
            System.out.println("Arquivo copiado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao copiar: " + e.getMessage());
        }
    }

    // Exercício 5: Mover e renomear arquivo
    public static void exercicio5_moverArquivo(String origemStr, String destinoStr) {
        Path origem = Path.of(origemStr);
        Path destino = Path.of(destinoStr);

        try {
            Files.move(origem, destino, ATOMIC_MOVE);
            System.out.println("Arquivo movido com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao mover: " + e.getMessage());
        }
    }

    // Método principal para testar os exercícios
    public static void main(String[] args) {
        // Novo caminho base, agora para a pasta 'projeto/notas'
        String basePath = "C:\\Users\\WINDOWS 11\\eclipse-workspace\\AdaCursodeFormacao\\projeto\\notas\\";

        try {
            System.out.println("=== Exercício 1 ===");
            exercicio1_infoArquivo(basePath + "nota1.txt");

            System.out.println("\n=== Exercício 2 ===");
            exercicio2_listarArquivosTxt(basePath);

            System.out.println("\n=== Exercício 3 ===");
            exercicio3_lerArquivo(basePath + "nota1.txt");

            System.out.println("\n=== Exercício 4 ===");
            exercicio4_copiarArquivo(basePath + "nota1.txt", basePath + "nota1-backup.txt");

            System.out.println("\n=== Exercício 5 ===");
            exercicio5_moverArquivo(basePath + "nota1-backup.txt", basePath + "nota1-movida.txt");

        } catch (IOException e) {
            System.out.println("Erro geral: " + e.getMessage());
        }
    }
}
