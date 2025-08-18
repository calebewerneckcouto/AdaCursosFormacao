package POODesafio;

public class Livro {
    private String titulo;
    private Autor autor;
    private Categoria categoria;

    public Livro(String titulo, Autor autor, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\" - " + autor + " | Categoria: " + categoria;
    }
}
