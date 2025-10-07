package Optional;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.OptionalDouble;
import java.util.HashMap;
import java.util.Map;

public class PraticaCompleta {
    private static Map<String, Integer> estoque = new HashMap<>();
    
    static {
        estoque.put("produtoA", 10);
        estoque.put("produtoB", 0);
        // produtoC não existe no estoque
    }
    
    public static void main(String[] args) {
        // Exercício 1: Buscar produtos no estoque
        buscarProduto("produtoA");
        buscarProduto("produtoB"); 
        buscarProduto("produtoC");
        buscarProduto("produtoD");
        
        // Exercício 2: Processar estatísticas
        processarEstatisticas();
    }
    
    private static void buscarProduto(String produto) {
        Optional<Integer> quantidade = Optional.ofNullable(estoque.get(produto));
        
        System.out.println("\n=== Buscando " + produto + " ===");
        quantidade.ifPresentOrElse(
            qtd -> {
                if (qtd > 0) {
                    System.out.println(produto + ": " + qtd + " unidades disponíveis");
                } else {
                    System.out.println(produto + ": Fora de estoque");
                }
            },
            () -> System.out.println(produto + ": Produto não encontrado")
        );
        
        // Usando filter para produtos disponíveis
        quantidade.filter(q -> q > 0)
            .ifPresent(q -> System.out.println("✓ " + produto + " disponível para venda"));
    }
    
    private static void processarEstatisticas() {
        System.out.println("\n=== Estatísticas do Estoque ===");
        
        // OptionalInt para máximo
        OptionalInt maximo = estoque.values().stream()
            .mapToInt(Integer::intValue)
            .max();
            
        // OptionalInt para mínimo  
        OptionalInt minimo = estoque.values().stream()
            .mapToInt(Integer::intValue)
            .min();
            
        // OptionalDouble para média
        OptionalDouble media = estoque.values().stream()
            .mapToInt(Integer::intValue)
            .average();
        
        System.out.println("Estoque máximo: " + maximo.orElse(0));
        System.out.println("Estoque mínimo: " + minimo.orElse(0));
        System.out.println("Média de estoque: " + media.orElse(0.0));
        
        // Combinando resultados
        if (maximo.isPresent() && minimo.isPresent()) {
            int diferenca = maximo.getAsInt() - minimo.getAsInt();
            System.out.println("Diferença entre máximo e mínimo: " + diferenca);
        }
    }
}