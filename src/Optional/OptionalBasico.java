package Optional;

import java.util.Optional;

public class OptionalBasico {
    public static void main(String[] args) {
        // Exercício 1: Criação de Optional
        Optional<String> optionalVazio = Optional.empty();
        Optional<String> optionalComValor = Optional.of("Hello World");
        Optional<String> optionalNullable = Optional.ofNullable(null);
        
        // Exercício 2: Verificação e obtenção de valores
        System.out.println("=== Exercício 2 ===");
        System.out.println("Optional vazio está presente? " + optionalVazio.isPresent());
        System.out.println("Optional com valor está presente? " + optionalComValor.isPresent());
        
        // Exercício 3: orElse e orElseGet
        String valor1 = optionalVazio.orElse("Valor padrão");
        String valor2 = optionalVazio.orElseGet(() -> "Valor gerado");
        System.out.println("orElse: " + valor1);
        System.out.println("orElseGet: " + valor2);
        
        // Exercício 4: ifPresent e ifPresentOrElse
        optionalComValor.ifPresent(valor -> System.out.println("Valor presente: " + valor));
        optionalVazio.ifPresentOrElse(
            valor -> System.out.println("Valor: " + valor),
            () -> System.out.println("Valor não presente")
        );
        
        // Exercício 5: map e flatMap
        Optional<Integer> tamanho = optionalComValor.map(String::length);
        tamanho.ifPresent(t -> System.out.println("Tamanho: " + t));
        
        // Exercício 6: filter
        Optional<String> filtrado = optionalComValor.filter(s -> s.length() > 5);
        filtrado.ifPresent(f -> System.out.println("Filtrado: " + f));
    }
}