package ExpressaoLambda;

import java.util.Arrays;
import java.util.List;

public class NumerosPositivosSomar {
    
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(-15, 10, -6, 18, 76, 48, 53, 33);
        
        // Soma apenas os números positivos
        int somaNumerosMaiores = numeros.stream()
                                        .filter(n -> n > 0)
                                        .mapToInt(Integer::intValue)
                                        .sum();
        
        System.out.println("Soma dos números positivos: " + somaNumerosMaiores);
    }
}
