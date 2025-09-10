package Record.Biblioteca;

import java.time.Year;

public record Livro(String titulo, String autor, int anoPublicacao, double preco, String categoria) {

        // Construtor com validação
        public Livro {
            if (preco < 0) {
                throw new IllegalArgumentException("Preço não pode ser negativo.");
            }
            int anoAtual = Year.now().getValue();
            if (anoPublicacao > anoAtual) {
                throw new IllegalArgumentException("Ano de publicação não pode ser no futuro.");
            }
        }

        // Método que retorna descrição
        public String descricao() {
            return titulo + " de " + autor + " (" + anoPublicacao + ")";
        }

        // Método que aplica desconto e retorna novo Livro
        public Livro aplicaDesconto(double percentual) {
            double novoPreco = preco * (1 - percentual / 100);
            return new Livro(titulo, autor, anoPublicacao, novoPreco, autor);
        }
    }
