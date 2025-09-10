package Record.Biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
	public static void main(String[] args) {
		
		 // Criando lista de livros
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 120.0, "fantasia"));
        livros.add(new Livro("Clean Code", "Robert C. Martin", 2008, 100.0, "Tecnologia"));
        livros.add(new Livro("Java: Guia do Programador", "Herbert Schildt", 2015, 80.0, "Tecnologia"));
        livros.add(new Livro("Effective Java", "Joshua Bloch", 2018, 150.0, "Tecnologia"));

        // Filtra livros publicados a partir de 2010
        List<Livro> livrosRecentes = livros.stream()
                .filter(l -> l.anoPublicacao() >= 2010)
                .map(l -> l.aplicaDesconto(10)) // Aplica 10% de desconto
                .collect(Collectors.toList());

        // Imprime descrição de cada livro com desconto
        livrosRecentes.forEach(l -> System.out.println(l.descricao() + " | Preço: " + l.preco()));
    }


}
