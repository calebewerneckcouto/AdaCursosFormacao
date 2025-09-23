package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataFormatterDemo {

    public static void main(String[] args) {

        // Criação de datas
        LocalDate localDate = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTime = LocalDateTime.parse("2002-07-20T01:30:26");
        Instant instant = Instant.parse("2024-11-20T21:06:26Z");

        // Formatadores
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter zonedInstantFormatter = dateTimeFormatter.withZone(ZoneId.systemDefault());
        DateTimeFormatter isoDateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter isoInstantFormatter = DateTimeFormatter.ISO_INSTANT;

        // Impressão formatada de LocalDate
        System.out.println("=== LocalDate ===");
        System.out.println("Original: " + localDate);
        System.out.println("Formatado (dd/MM/yyyy): " + localDate.format(dateFormatter));
        System.out.println();

        // Impressão formatada de LocalDateTime
        System.out.println("=== LocalDateTime ===");
        System.out.println("Original: " + localDateTime);
        System.out.println("Apenas data: " + localDateTime.format(dateFormatter));
        System.out.println("Data e hora: " + localDateTime.format(dateTimeFormatter));
        System.out.println("Formato ISO_DATE_TIME: " + localDateTime.format(isoDateTimeFormatter));
        System.out.println();

        // Impressão formatada de Instant (em UTC e no fuso local)
        System.out.println("=== Instant ===");
        System.out.println("Original (UTC): " + instant);
        System.out.println("Formatado no fuso local: " + zonedInstantFormatter.format(instant));
        System.out.println("Formato ISO_INSTANT (UTC): " + isoInstantFormatter.format(instant));
    }
}
