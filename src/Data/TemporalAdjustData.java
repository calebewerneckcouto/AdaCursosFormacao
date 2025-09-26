package Data;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustData {
	public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate proximaSexta = hoje.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.println("Hoje: " + hoje);
        System.out.println("Próxima sexta-feira: " + proximaSexta);
    }
}
