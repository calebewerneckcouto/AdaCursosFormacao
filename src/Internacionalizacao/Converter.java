package Internacionalizacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Converter {

    // Converte java.util.Date para LocalDate
    public static LocalDate dateToLocalDate(Date date) {
        return date.toInstant()
            .atZone(java.time.ZoneId.systemDefault())
            .toLocalDate();
    }

    // Converte java.util.Date para LocalDateTime
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return date.toInstant()
            .atZone(java.time.ZoneId.systemDefault())
            .toLocalDateTime();
    }

    // Converte LocalDate para java.util.Date
    public static Date localDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay()
            .atZone(java.time.ZoneId.systemDefault())
            .toInstant());
    }

    // Converte LocalDateTime para java.util.Date
    public static Date localDateTimeToDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(java.time.ZoneId.systemDefault())
            .toInstant());
    }

    // ====== MAIN DE TESTE ======
    public static void main(String[] args) {
        // Criando um java.util.Date atual
        Date agoraDate = new Date();
        System.out.println("java.util.Date atual: " + agoraDate);

        // Convertendo Date -> LocalDate
        LocalDate localDate = dateToLocalDate(agoraDate);
        System.out.println("Convertido para LocalDate: " + localDate);

        // Convertendo Date -> LocalDateTime
        LocalDateTime localDateTime = dateToLocalDateTime(agoraDate);
        System.out.println("Convertido para LocalDateTime: " + localDateTime);

        // Convertendo LocalDate -> Date
        Date dateFromLocalDate = localDateToDate(localDate);
        System.out.println("LocalDate para java.util.Date: " + dateFromLocalDate);

        // Convertendo LocalDateTime -> Date
        Date dateFromLocalDateTime = localDateTimeToDate(localDateTime);
        System.out.println("LocalDateTime para java.util.Date: " + dateFromLocalDateTime);
    }
}
