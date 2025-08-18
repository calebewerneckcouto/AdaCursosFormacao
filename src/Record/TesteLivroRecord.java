package Record;

public class TesteLivroRecord {
    public static void main(String[] args) {
        // Criando um LivroRecord
        LivroRecord livro1 = new LivroRecord("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        // Acessando os dados
        System.out.println("Título: " + livro1.titulo());
        System.out.println("Autor: " + livro1.autor());
        System.out.println("Ano: " + livro1.anoPublicacao());

        // Usando método adicional
        System.out.println("Resumo: " + livro1.resumo());

        // Records são imutáveis, então não é possível alterar os campos
        // livro1.titulo = "Novo Título"; // Isso daria erro de compilação
    }
}
