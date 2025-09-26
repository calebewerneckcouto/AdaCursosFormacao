package Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class ConvertStringDatas {
    public static void main(String[] args) {
        LocalDate data = LocalDate.parse("2025-09-23");
        LocalTime hora = LocalTime.parse("08:45:00");
        LocalDateTime dataHora = LocalDateTime.parse("2025-09-23T08:45:00");

        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Data e Hora: " + dataHora);
    }
}
