package Internacionalizacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class InternacionalizacaoDatas {

    public static void main(String[] args) {
        var hoje = LocalDate.now();

        // Locale para português do Brasil
        var brasil = new Locale("pt", "BR");

        // Formatando para o dia da semana
        var diaDaSemana = hoje.format(DateTimeFormatter.ofPattern("EEEE", brasil));

        System.out.println(diaDaSemana);
    }
}
