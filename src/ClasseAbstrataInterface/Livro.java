package ClasseAbstrataInterface;

public class Livro implements Emprestavel, Catalogavel {
    private String titulo;
    private String categoria;
    private boolean disponivel;

    public Livro(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.disponivel = true;
    }

    // Implementando Emprestavel
    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }

    @Override
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso!");
        } else {
            System.out.println("Livro \"" + titulo + "\" não está disponível.");
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Livro \"" + titulo + "\" devolvido.");
    }

    // Implementando Catalogavel
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | Categoria: " + categoria + " | Disponível: " + disponivel;
    }
}
