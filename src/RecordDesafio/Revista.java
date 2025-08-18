package RecordDesafio;

public class Revista implements Emprestavel {
    private final String titulo;
    private final Categoria categoria;
    private boolean disponivel;

    public Revista(String titulo, Categoria categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.disponivel = true;
    }

    public String getTitulo() { return titulo; }
    public Categoria getCategoria() { return categoria; }

    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }

    @Override
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Revista \"" + titulo + "\" emprestada!");
        } else {
            System.out.println("Revista \"" + titulo + "\" não está disponível.");
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Revista \"" + titulo + "\" devolvida!");
    }

    @Override
    public String toString() {
        return "Revista: " + titulo + " | Categoria: " + categoria.nome() + " | Disponível: " + disponivel;
    }
}
