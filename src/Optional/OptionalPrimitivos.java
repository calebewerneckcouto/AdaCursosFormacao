package Optional;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalPrimitivos {
    public static void main(String[] args) {
        // Exercício 1: OptionalInt
        OptionalInt optionalIntVazio = OptionalInt.empty();
        OptionalInt optionalIntComValor = OptionalInt.of(42);
        
        System.out.println("=== OptionalInt ===");
        System.out.println("Valor: " + optionalIntComValor.orElse(-1));
        optionalIntVazio.ifPresentOrElse(
            valor -> System.out.println("Valor int: " + valor),
            () -> System.out.println("Nenhum valor int")
        );
        
        // Exercício 2: OptionalLong
        OptionalLong optionalLong = OptionalLong.of(10000000000L);
        System.out.println("\n=== OptionalLong ===");
        System.out.println("getAsLong: " + optionalLong.getAsLong());
        System.out.println("orElse: " + optionalLong.orElse(0L));
        
        // Exercício 3: OptionalDouble
        OptionalDouble optionalDouble = OptionalDouble.of(3.14159);
        OptionalDouble optionalDoubleVazio = OptionalDouble.empty();
        
        System.out.println("\n=== OptionalDouble ===");
        optionalDouble.ifPresent(d -> System.out.println("Valor double: " + d));
        System.out.println("Valor vazio orElse: " + optionalDoubleVazio.orElse(0.0));
        
        // Exercício 4: Uso com streams
        int[] numeros = {1, 2, 3, 4, 5};
        OptionalInt maximo = IntStream.of(numeros).max();
        OptionalInt minimo = IntStream.of(numeros).min();
        OptionalDouble media = IntStream.of(numeros).average();
        
        System.out.println("\n=== Com Streams ===");
        maximo.ifPresent(m -> System.out.println("Máximo: " + m));
        minimo.ifPresent(m -> System.out.println("Mínimo: " + m));
        media.ifPresent(m -> System.out.println("Média: " + m));
    }
}