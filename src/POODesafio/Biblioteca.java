package POODesafio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    // Adicionar livro
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    // Remover livro pelo título
    public boolean removerLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.remove(livro);
                System.out.println("Livro removido: " + titulo);
                return true;
            }
        }
        System.out.println("Livro não encontrado: " + titulo);
        return false;
    }

    // Listar todos os livros
    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("=== Livros da Biblioteca ===");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
}
