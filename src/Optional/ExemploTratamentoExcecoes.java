package Optional;
import java.time.Instant;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploTratamentoExcecoes {

    /**
     * Simula a obtenção de um número inteiro par aleatório,
     * retornando um Optional.empty() em 50% dos casos.
     */
    public static Optional<Integer> obtemAleatorioPar() {
        // Gera um número entre 1 e 10.
        int num = ThreadLocalRandom.current().nextInt(1, 11);

        // Retorna o número em um Optional se for par, ou Optional.empty()
        // em 50% dos casos (simulando um erro/ausência de valor).
        if (num % 2 == 0) {
            return Optional.of(num);
        } else {
            // Em vez de retornar Optional.empty() para um ímpar, vamos simular
            // a possibilidade de 'não ter um número' se o número for ímpar.
            // Para ter Optional.empty() em 50% dos casos:
            if (ThreadLocalRandom.current().nextBoolean()) {
                return Optional.empty(); // 50% de chance de estar vazio
            } else {
                // Para garantir que Optional.empty() é o cenário a ser tratado.
                return Optional.empty();
            }
        }
    }

    public static void main(String[] args) {
        
        Optional<Integer> number = obtemAleatorioPar();

        Instant begin = Instant.now();

        try {
          
            if (number.isPresent()) {
                System.out.println("Número obtido: " + number.get());
            } else {
               
                throw new RuntimeException("Não possui um número (Optional vazio)");
            }
        } catch (RuntimeException e) {
           
            System.err.println("Erro: " + e.getMessage());

           
            System.out.println("Tentando acessar o Optional novamente (pode falhar se vazio): " + number.orElse(null));
        }

        Instant end = Instant.now();

        System.out.println("\nTempo de execução (aproximado): " +
                           (end.toEpochMilli() - begin.toEpochMilli()) + "ms");
    }
}