package Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatandoDateTimeFormat {
    public static void main(String[] args) {
        String texto = "23-09-2025 08:45";
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime dataHora = LocalDateTime.parse(texto, formatoBR);

        DateTimeFormatter outroFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h'mm");
        System.out.println("Data formatada: " + dataHora.format(outroFormato));
    }
}
