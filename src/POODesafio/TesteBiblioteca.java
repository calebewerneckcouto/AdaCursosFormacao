package POODesafio;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Autor autor1 = new Autor("J.K. Rowling", "Reino Unido");
        Categoria cat1 = new Categoria("Fantasia");

        LivroFisico livro1 = new LivroFisico("Harry Potter e a Pedra Filosofal", autor1, cat1, 309);
        LivroDigital livro2 = new LivroDigital("Harry Potter e a Câmara Secreta", autor1, cat1, 5.2);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.listarLivros();

        biblioteca.removerLivro("Harry Potter e a Pedra Filosofal");
        biblioteca.listarLivros();
    }
}
