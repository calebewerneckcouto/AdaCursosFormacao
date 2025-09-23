package JAVATIME;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar validadores
        ValidadorEvento validadorFuturo = new ValidadorDataFutura();
        ValidadorEvento validadorDuracao = new ValidadorDuracao(Duration.ofMinutes(30));
        List<ValidadorEvento> validadores = Arrays.asList(validadorFuturo, validadorDuracao);

        // Escolher formatador (você pode alternar entre FormatadorBrasileiro e FormatadorISO)
        FormataDataEvento formatador = new FormatadorBrasileiro();
        // FormataDataEvento formatador = new FormatadorISO();

        // Criar Gerenciador de Agenda
        GerenciadorAgenda agenda = new GerenciadorAgenda(validadores, formatador);

        // Criar eventos
        EventoAgenda evento1 = new EventoAgenda(
                "Reunião com equipe",
                LocalDateTime.now().plusDays(1).withHour(10).withMinute(0),
                LocalDateTime.now().plusDays(1).withHour(11).withMinute(0),
                "Discutir andamento do projeto"
        );

        EventoAgenda evento2 = new EventoAgenda(
                "Almoço com cliente",
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(2).plusMinutes(20),
                "Reunião informal"
        );

        // Adicionar eventos
        System.out.println("Adicionando evento 1...");
        if (agenda.adicionarEvento(evento1)) {
            System.out.println("Evento 1 adicionado com sucesso.");
        }

        System.out.println("Adicionando evento 2...");
        if (agenda.adicionarEvento(evento2)) {
            System.out.println("Evento 2 adicionado com sucesso.");
        }

        // Listar eventos formatados
        System.out.println("\nEventos formatados:");
        List<String> eventosFormatados = agenda.listarEventosFormatados();
        for (String eventoFormatado : eventosFormatados) {
            System.out.println(eventoFormatado);
        }
    }
}
