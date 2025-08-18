package RecordDesafio;

public class TesteBiblioteca {
    public static void main(String[] args) {
        var autor1 = new Autor("J.K. Rowling", "Reino Unido");
        var catFantasia = new Categoria("Fantasia");
        var catTecnologia = new Categoria("Tecnologia");

        var livro1 = new Livro("Harry Potter e a Pedra Filosofal", autor1, catFantasia);
        var revista1 = new Revista("Revista Ciência Hoje", catTecnologia);

        var biblioteca = new Biblioteca();
        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(revista1);

        biblioteca.listarItens();

        // Testando empréstimos
        livro1.emprestar();
        livro1.devolver();
    }
}
