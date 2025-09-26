package Data;

import java.time.LocalDate;
import java.time.Period;

public class PeriodoDatas {
	public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2025, 1, 1);
        Period periodo = Period.ofMonths(6);
        LocalDate fim = inicio.plus(periodo);

        System.out.println("Início: " + inicio);
        System.out.println("Fim (após 6 meses): " + fim);
    }
}
