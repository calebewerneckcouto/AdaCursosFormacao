package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataConversionExamples {

    public static void main(String[] args) {

        // ======= 1. Criando datas e horários =======
        LocalDate localDate = LocalDate.parse("2022-07-20");               // ISO local date
        LocalDateTime localDateTime = LocalDateTime.parse("2002-07-20T01:30:26");  // ISO local datetime
        Instant instant = Instant.parse("2024-11-20T21:06:26Z");           // ISO instant (UTC)

        // Criando com of()
        LocalDate ldOf = LocalDate.of(2022, 11, 20);
        LocalDateTime ldtOf = LocalDateTime.of(2022, 7, 20, 1, 30);

        // ======= 2. Parse com formatos customizados =======
        DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate parsedDate = LocalDate.parse("20/07/2022", fmtDate);
        LocalDateTime parsedDateTime = LocalDateTime.parse("20/07/2022 01:30", fmtDateTime);

        // ======= 3. Formatação das datas =======
        DateTimeFormatter fmtOutputDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtOutputDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Para Instant, formatador deve ter zone (fuso local)
        DateTimeFormatter fmtInstantWithZone = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                                                                .withZone(ZoneId.systemDefault());

        // Formatos ISO padrões
        DateTimeFormatter fmtISODateTime = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmtISOInstant = DateTimeFormatter.ISO_INSTANT;

        System.out.println("=== Criação e Parse ===");
        System.out.println("LocalDate ISO: " + localDate);
        System.out.println("LocalDateTime ISO: " + localDateTime);
        System.out.println("Instant ISO: " + instant);
        System.out.println("LocalDate.of: " + ldOf);
        System.out.println("LocalDateTime.of: " + ldtOf);
        System.out.println("LocalDate parse custom: " + parsedDate);
        System.out.println("LocalDateTime parse custom: " + parsedDateTime);
        System.out.println();

        System.out.println("=== Formatação ===");
        System.out.println("LocalDate formatado: " + localDate.format(fmtOutputDate));
        System.out.println("LocalDateTime só data: " + localDateTime.format(fmtOutputDate));
        System.out.println("LocalDateTime com hora: " + localDateTime.format(fmtOutputDateTime));
        System.out.println("LocalDateTime formato ISO: " + localDateTime.format(fmtISODateTime));
        System.out.println("Instant formatado com fuso local: " + fmtInstantWithZone.format(instant));
        System.out.println("Instant formato ISO_INSTANT (UTC): " + fmtISOInstant.format(instant));
        System.out.println();

        // ======= 4. Conversão Instant -> LocalDate / LocalDateTime no fuso local =======
        LocalDate localDateFromInstant = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDateTime localDateTimeFromInstant = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();

        System.out.println("Instant convertido para LocalDate (fuso local): " + localDateFromInstant);
        System.out.println("Instant convertido para LocalDateTime (fuso local): " + localDateTimeFromInstant);
        System.out.println();

        // ======= 5. Soma de dias =======
        // Soma 5 dias no Instant
        Instant instantPlus5 = instant.plus(5, ChronoUnit.DAYS);
        LocalDate plus5LocalDateFromInstant = instantPlus5.atZone(ZoneId.systemDefault()).toLocalDate();

        // Soma 5 dias em LocalDate e LocalDateTime diretamente
        LocalDate localDatePlus5 = localDate.plusDays(5);
        LocalDateTime localDateTimePlus5 = localDateTime.plusDays(5);

        System.out.println("Instant original: " + instant);
        System.out.println("Instant + 5 dias (UTC): " + instantPlus5);
        System.out.println("Instant + 5 dias convertido para LocalDate (fuso local): " + plus5LocalDateFromInstant);
        System.out.println("LocalDate + 5 dias: " + localDatePlus5);
        System.out.println("LocalDateTime + 5 dias: " + localDateTimePlus5);
    }
}
