package Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class ExampleLocalDate {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalTime agora = LocalTime.now();
        LocalDateTime dataHora = LocalDateTime.now();

        System.out.println("Data atual: " + hoje);
        System.out.println("Hora atual: " + agora);
        System.out.println("Data e hora atuais: " + dataHora);
    }
}
