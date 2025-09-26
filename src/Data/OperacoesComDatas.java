package Data;

import java.time.LocalDate;

public class OperacoesComDatas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate semanaQueVem = hoje.plusDays(7);
        LocalDate semanaPassada = hoje.minusDays(7);

        System.out.println("Hoje: " + hoje);
        System.out.println("Semana que vem: " + semanaQueVem);
        System.out.println("Semana passada: " + semanaPassada);
        System.out.println("Dia da semana: " + hoje.getDayOfWeek());
    }
}
