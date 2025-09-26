package Data;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HorarioVerao {
    public static void main(String[] args) {
        ZoneId sp = ZoneId.of("America/Sao_Paulo");

        LocalDateTime data = LocalDateTime.of(2018, 12, 1, 5, 0);
        ZonedDateTime zoned = ZonedDateTime.of(data, sp);
        boolean emHorarioVerao = sp.getRules().isDaylightSavings(zoned.toInstant());

        System.out.println("Em " + zoned + " SP estava em horário de verão? " + emHorarioVerao);
    }
}
