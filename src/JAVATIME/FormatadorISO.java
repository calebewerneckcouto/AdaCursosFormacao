package JAVATIME;

public class FormatadorISO implements FormataDataEvento {

	@Override
    public String formatarDataCompleta(EventoAgenda evento) {
        return String.format("%s [%s to %s]", 
            evento.getTitulo(),
            evento.getDataInicio().toString(),
            evento.getDataFim().toString());
    }
    
    @Override
    public String formatarResumo(EventoAgenda evento) {
        return String.format("%s @ %s", 
            evento.getTitulo(),
            evento.getDataInicio().toLocalDate().toString());
    }

}
