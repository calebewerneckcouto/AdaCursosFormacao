package Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DataCustomizadas {
    public static void main(String[] args) {
        LocalDate natal = LocalDate.of(2025, 12, 25);
        LocalTime almoco = LocalTime.of(12, 30, 0);
        LocalDateTime aniversario = LocalDateTime.of(2025, 11, 10, 15, 0);

        System.out.println("Natal: " + natal);
        System.out.println("Horário do almoço: " + almoco);
        System.out.println("Aniversário: " + aniversario);
    }
}
