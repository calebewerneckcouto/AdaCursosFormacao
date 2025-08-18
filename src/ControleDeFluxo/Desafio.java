package ControleDeFluxo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Desafio {

    public static void main(String[] args) {
        /*
         * Estudo de caso: Dado um feriado, se tiver emenda (terça ou quinta-feira),
         * vamos planejar uma viagem.
         * 
         * Desafio: Calcular quantos dias, dias úteis (seg a sex) e semanas faltam de
         * hoje até a data da viagem.
         */

        // Suponha que o feriado seja informado aqui
        LocalDate feriado = LocalDate.of(2025, 8, 15); // exemplo: 15/08/2025

        // Determinar a data da viagem
        LocalDate dataViagem = calcularDataViagem(feriado);

        // Data atual
        LocalDate hoje = LocalDate.now();

        // Calcular diferença total de dias
        long diasTotais = ChronoUnit.DAYS.between(hoje, dataViagem);

        // Calcular dias úteis
        long diasUteis = contarDiasUteis(hoje, dataViagem);

        // Calcular semanas
        long semanas = diasTotais / 7;

        // Mostrar resultados
        System.out.println("Data do feriado: " + feriado);
        System.out.println("Data da viagem: " + dataViagem);
        System.out.println("Dias restantes: " + diasTotais);
        System.out.println("Dias úteis restantes: " + diasUteis);
        System.out.println("Semanas restantes: " + semanas);
    }

    // Função para calcular a data da viagem
    public static LocalDate calcularDataViagem(LocalDate feriado) {
        DayOfWeek diaSemana = feriado.getDayOfWeek();

        // Se feriado terça-feira, viagem na segunda anterior
        if (diaSemana == DayOfWeek.TUESDAY) {
            return feriado.minusDays(1);
        }

        // Se feriado quinta-feira, viagem na sexta seguinte
        if (diaSemana == DayOfWeek.THURSDAY) {
            return feriado.plusDays(1);
        }

        // Caso contrário, viagem no próprio feriado
        return feriado;
    }

    // Função para contar dias úteis entre duas datas
    public static long contarDiasUteis(LocalDate inicio, LocalDate fim) {
        long diasUteis = 0;
        LocalDate data = inicio;

        while (!data.isAfter(fim)) {
            DayOfWeek diaSemana = data.getDayOfWeek();
            if (diaSemana != DayOfWeek.SATURDAY && diaSemana != DayOfWeek.SUNDAY) {
                diasUteis++;
            }
            data = data.plusDays(1);
        }

        return diasUteis;
    }
}
