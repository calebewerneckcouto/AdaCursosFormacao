package RecordDesafio;

public class Livro implements Emprestavel {
    private final String titulo;
    private final Autor autor;
    private final Categoria categoria;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponivel = true;
    }

    public String getTitulo() { return titulo; }
    public Autor getAutor() { return autor; }
    public Categoria getCategoria() { return categoria; }

    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }

    @Override
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado!");
        } else {
            System.out.println("Livro \"" + titulo + "\" não está disponível.");
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Livro \"" + titulo + "\" devolvido!");
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" de " + autor.nome() + " | Categoria: " + categoria.nome() + 
               " | Disponível: " + disponivel;
    }
}
