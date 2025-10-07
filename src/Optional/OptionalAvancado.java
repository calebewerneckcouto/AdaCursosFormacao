package Optional;
import java.util.Optional;
import java.util.List;
import java.util.Arrays;

public class OptionalAvancado {
    public static void main(String[] args) {
        // Exercício 1: Optional com collections
        List<Optional<String>> listaOptionals = Arrays.asList(
            Optional.of("Primeiro"),
            Optional.empty(),
            Optional.of("Terceiro"),
            Optional.empty(),
            Optional.of("Quinto")
        );
        
        System.out.println("=== Filtrando Optionals vazios ===");
        listaOptionals.stream()
            .filter(Optional::isPresent)
            .map(Optional::get)
            .forEach(System.out::println);
        
        // Exercício 2: orElseThrow
        Optional<String> optionalComValor = Optional.of("Valor importante");
        Optional<String> optionalVazio = Optional.empty();
        
        try {
            String valor1 = optionalComValor.orElseThrow();
            System.out.println("\nValor obtido: " + valor1);
            
            String valor2 = optionalVazio.orElseThrow(
                () -> new RuntimeException("Valor não encontrado!")
            );
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        // Exercício 3: Métodos utilitários
        System.out.println("\n=== Métodos Utilitários ===");
        Optional<String> resultado = encontrarPrimeiroNaoVazio(
            Optional.empty(),
            Optional.of("Segunda opção"),
            Optional.of("Terceira opção")
        );
        
        resultado.ifPresent(r -> System.out.println("Primeiro não vazio: " + r));
    }
    
    // Exercício 4: Método que retorna Optional
    private static Optional<String> processarTexto(String texto) {
        return Optional.ofNullable(texto)
            .filter(t -> !t.trim().isEmpty())
            .map(String::toUpperCase);
    }
    
    // Exercício 5: Encontrar primeiro Optional não vazio
    @SafeVarargs
    private static Optional<String> encontrarPrimeiroNaoVazio(Optional<String>... optionals) {
        return Arrays.stream(optionals)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .findFirst();
    }
}