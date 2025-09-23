package Data;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Formatadores {

    public static void main(String[] args) {

        // Usando a API antiga (java.util.Date + SimpleDateFormat)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date nowOld = new Date();
        String dataFormatadaAntiga = sdf.format(nowOld);

        // Usando a API moderna (java.time.LocalDateTime + DateTimeFormatter)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime nowNew = LocalDateTime.now();
        String dataFormatadaNova = nowNew.format(formatter);

        // Convertendo Date para Instant e depois para LocalDateTime para usar DateTimeFormatter
        Instant instantFromDate = nowOld.toInstant();
        LocalDateTime ldtFromInstant = instantFromDate.atZone(ZoneId.systemDefault()).toLocalDateTime();
        String dataFormatadaConvertida = ldtFromInstant.format(formatter);

        // Saída formatada
        System.out.println("Data formatada com SimpleDateFormat (API antiga): " + dataFormatadaAntiga);
        System.out.println("Data formatada com DateTimeFormatter (API moderna): " + dataFormatadaNova);
        System.out.println("Date convertida para LocalDateTime e formatada: " + dataFormatadaConvertida);
    }
}
