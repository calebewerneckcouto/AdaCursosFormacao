package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class DiaDaSemanaExample {

    public static void main(String[] args) {
        // Exemplo de datas
        LocalDate ld = LocalDate.of(2024, 9, 22);
        LocalDateTime ldt = LocalDateTime.of(2024, 9, 22, 14, 30);
        Instant instant = Instant.parse("2024-09-22T14:30:00Z");

        System.out.println("LocalDate: " + ld + " -> Dia da semana: " + getDiaDaSemana(ld, Locale.ENGLISH));
        System.out.println("LocalDateTime: " + ldt + " -> Dia da semana: " + getDiaDaSemana(ldt, Locale.ENGLISH));
        System.out.println("Instant: " + instant + " -> Dia da semana: " + getDiaDaSemana(instant, ZoneId.systemDefault(), Locale.ENGLISH));
        
        // Em português (Brasil)
        System.out.println();
        System.out.println("Em português:");
        System.out.println("LocalDate: " + ld + " -> Dia da semana: " + getDiaDaSemana(ld, new Locale("pt", "BR")));
        System.out.println("LocalDateTime: " + ldt + " -> Dia da semana: " + getDiaDaSemana(ldt, new Locale("pt", "BR")));
        System.out.println("Instant: " + instant + " -> Dia da semana: " + getDiaDaSemana(instant, ZoneId.systemDefault(), new Locale("pt", "BR")));
    }

    // Para LocalDate
    public static String getDiaDaSemana(LocalDate date, Locale locale) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    // Para LocalDateTime
    public static String getDiaDaSemana(LocalDateTime dateTime, Locale locale) {
        return dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }

    // Para Instant, precisa converter para ZonedDateTime para saber o dia da semana no fuso desejado
    public static String getDiaDaSemana(Instant instant, ZoneId zone, Locale locale) {
        return instant.atZone(zone).getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }
}
