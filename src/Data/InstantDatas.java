package Data;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDatas {
	public static void main(String[] args) {
        ZonedDateTime dataEvento = ZonedDateTime.of(2025, 9, 23, 14, 30, 0, 0, ZoneId.of("America/Sao_Paulo"));
        Instant instante = dataEvento.toInstant();

        System.out.println("Data do evento: " + dataEvento);
        System.out.println("Instante UTC: " + instante);
        System.out.println("Segundos desde 1970: " + instante.getEpochSecond());
    }
}
