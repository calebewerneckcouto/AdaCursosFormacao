package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Exercicios {
    public static void main(String[] args) {
        Instant hoje = Instant.now();
        LocalDate hojeLocal = hoje.atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate natal = LocalDate.of(hojeLocal.getYear(), 12, 25);

        
        if (hojeLocal.isAfter(natal)) {
            natal = natal.plusYears(1);
        }

        long diasFaltando = ChronoUnit.DAYS.between(hojeLocal, natal);

        System.out.println("Hoje é: " + hojeLocal);
        System.out.println("Dias faltando para o Natal: " + diasFaltando);
    }
}
