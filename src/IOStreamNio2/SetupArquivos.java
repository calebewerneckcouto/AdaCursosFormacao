package IOStreamNio2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;

public class SetupArquivos {

    public static void main(String[] args) {
        try {
            // Criar diretórios
            Path baseDir = Paths.get("projeto");
            Path dataDir = baseDir.resolve("data");
            Path notasDir = baseDir.resolve("notas");
            Path backupDir = baseDir.resolve("backup");
            Path arquivosDir = baseDir.resolve("arquivos");

            Files.createDirectories(dataDir);
            Files.createDirectories(notasDir);
            Files.createDirectories(backupDir);
            Files.createDirectories(arquivosDir);

            // Criar arquivos com conteúdo
            criarArquivoSeNaoExiste(dataDir.resolve("planilha.txt"),
                    List.of("Receita: 10000", "Despesa: 4500", "Lucro: 5500"));

            criarArquivoSeNaoExiste(dataDir.resolve("custos.txt"),
                    List.of("Transporte: 500", "Alimentação: 800", "Hospedagem: 1200"));

            criarArquivoSeNaoExiste(notasDir.resolve("nota1.txt"),
                    List.of("Nota 1: 8.5"));

            criarArquivoSeNaoExiste(notasDir.resolve("nota2.txt"),
                    List.of("Nota 2: 9.2"));

            System.out.println("✅ Arquivos e diretórios criados com sucesso.");

        } catch (IOException e) {
            System.out.println("❌ Erro ao criar arquivos ou diretórios: " + e.getMessage());
        }
    }

    private static void criarArquivoSeNaoExiste(Path caminho, List<String> conteudo) throws IOException {
        if (!Files.exists(caminho)) {
            Files.write(caminho, conteudo, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
            System.out.println("Arquivo criado: " + caminho);
        } else {
            System.out.println("Arquivo já existe (não sobrescrito): " + caminho);
        }
    }
}
