package ClasseAbstrataInterface;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "Fantasia");
        Livro livro2 = new Livro("Java: Como Programar", "Tecnologia");
        Revista revista1 = new Revista("Revista Ciência Hoje", "Ciência");

        // Adicionando itens
        biblioteca.adicionarItem(livro1);
        biblioteca.adicionarItem(livro2);
        biblioteca.adicionarItem(revista1);

        // Listar todos os itens
        biblioteca.listarItens();

        // Buscar por título
        Catalogavel busca = biblioteca.buscarPorTitulo("O Senhor dos Anéis");
        System.out.println("\nBusca por título: " + (busca != null ? busca : "Não encontrado"));

        // Filtrar por categoria
        List<Catalogavel> filtrados = biblioteca.filtrarPorCategoria("Tecnologia");
        System.out.println("\nFiltrando por categoria 'Tecnologia':");
        for (Catalogavel item : filtrados) {
            System.out.println(item);
        }

        // Testar empréstimos
        if (livro1 instanceof Emprestavel) {
            ((Emprestavel) livro1).emprestar();
            ((Emprestavel) livro1).devolver();
        }
    }
}
