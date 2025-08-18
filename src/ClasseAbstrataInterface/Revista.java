package ClasseAbstrataInterface;

public class Revista implements Emprestavel, Catalogavel {
    private String titulo;
    private String categoria;
    private boolean disponivel;

    public Revista(String titulo, String categoria) {
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
            System.out.println("Revista \"" + titulo + "\" emprestada com sucesso!");
        } else {
            System.out.println("Revista \"" + titulo + "\" não está disponível.");
        }
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Revista \"" + titulo + "\" devolvida.");
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
        return "Revista: " + titulo + " | Categoria: " + categoria + " | Disponível: " + disponivel;
    }
}
