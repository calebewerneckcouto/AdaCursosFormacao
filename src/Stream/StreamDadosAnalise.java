package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDadosAnalise {
	
	public static void main(String[] args) {
System.out.println("=== EXERCÍCIO 12: Análise de Vendas ===");
        
     
        List<Venda> vendas = List.of(
            new Venda("Notebook", 2500.00, "Eletrônicos", 2),
            new Venda("Mouse", 50.00, "Eletrônicos", 10),
            new Venda("Livro Java", 80.00, "Livros", 5),
            new Venda("Smartphone", 1200.00, "Eletrônicos", 3),
            new Venda("Livro Python", 75.00, "Livros", 7),
            new Venda("Teclado", 150.00, "Eletrônicos", 8)
        );
        
        
        Map<String, Double> totalPorCategoria = vendas.stream()
            .collect(Collectors.groupingBy(
                Venda::getCategoria,
                Collectors.summingDouble(v -> v.getPreco() * v.getQuantidade())
            ));
        System.out.println("Total de vendas por categoria: " + totalPorCategoria);
        
       
        Optional<Venda> maisVendido = vendas.stream()
            .max(Comparator.comparing(Venda::getQuantidade));
        maisVendido.ifPresent(v -> 
            System.out.println("Produto mais vendido: " + v.getProduto() + " (" + v.getQuantidade() + " unidades)"));
        
        
        double receitaTotal = vendas.stream()
            .mapToDouble(v -> v.getPreco() * v.getQuantidade())
            .sum();
        System.out.println("Receita total: R$ " + String.format("%.2f", receitaTotal));
        
       
        double precoMedio = vendas.stream()
            .mapToDouble(Venda::getPreco)
            .average()
            .orElse(0.0);
        System.out.println("Preço médio: R$ " + String.format("%.2f", precoMedio));
        
        List<String> produtosCaros = vendas.stream()
            .filter(v -> v.getPreco() > precoMedio)
            .map(Venda::getProduto)
            .collect(Collectors.toList());
        System.out.println("Produtos acima do preço médio: " + produtosCaros);
        System.out.println();
	}

}
