package Data;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FusoHorarioDatas {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        ZonedDateTime sp = ZonedDateTime.of(agora, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime lisboa = ZonedDateTime.of(agora, ZoneId.of("Europe/Lisbon"));

        System.out.println("SP: " + sp);
        System.out.println("Lisboa: " + lisboa);
    }
}
