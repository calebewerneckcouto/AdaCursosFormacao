package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataFormatterExample {

    public static void main(String[] args) {

        // Datas de exemplo
        LocalDate localDate = LocalDate.parse("2022-07-20");
        LocalDateTime localDateTime = LocalDateTime.parse("2002-07-20T01:30:26");
        Instant instant = Instant.parse("2024-11-20T21:06:26Z");

        // Formatadores personalizados
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        // Para Instant, é necessário definir o fuso horário do sistema
        DateTimeFormatter instantWithZoneFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                                                                       .withZone(ZoneId.systemDefault());

        // Formatadores padrão ISO
        DateTimeFormatter isoDateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter isoInstantFormatter = DateTimeFormatter.ISO_INSTANT;

        // Impressão formatada do LocalDate
        System.out.println("----- LocalDate (d04) -----");
        System.out.println("Formato customizado (dd/MM/yyyy): " + localDate.format(dateFormatter));
        System.out.println();

        // Impressão formatada do LocalDateTime
        System.out.println("----- LocalDateTime (d05) -----");
        System.out.println("Formato apenas data (dd/MM/yyyy): " + localDateTime.format(dateFormatter));
        System.out.println("Formato data e hora (dd/MM/yyyy HH:mm): " + localDateTime.format(dateTimeFormatter));
        System.out.println("Formato ISO_DATE_TIME: " + localDateTime.format(isoDateTimeFormatter));
        System.out.println();

        // Impressão formatada do Instant
        System.out.println("----- Instant (d06) -----");
        System.out.println("Com fuso horário do sistema (dd/MM/yyyy HH:mm): " + instantWithZoneFormatter.format(instant));
        System.out.println("Formato ISO_INSTANT (padrão UTC): " + isoInstantFormatter.format(instant));
    }
}
