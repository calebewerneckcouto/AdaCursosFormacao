package JAVATIME;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAgenda {

    private final List<ValidadorEvento> validadores;
    private final FormataDataEvento formatador;
    private final List<EventoAgenda> eventos;

    public GerenciadorAgenda(List<ValidadorEvento> validadores, FormataDataEvento formatador) {
        this.validadores = validadores;
        this.formatador = formatador;
        this.eventos = new ArrayList<>();
    }

    public boolean adicionarEvento(EventoAgenda evento) {
        for (ValidadorEvento validador : validadores) {
            if (!validador.validar(evento)) {
                System.err.println("Erro de validação: " + validador.getMensagemErro());
                return false;
            }
        }
        eventos.add(evento);
        return true;
    }

    public List<String> listarEventosFormatados() {
        return eventos.stream()
                .map(formatador::formatarDataCompleta)
                .toList();
    }

   
}
