package JAVATIME;

import java.time.format.DateTimeFormatter;

public class FormatadorBrasileiro implements FormataDataEvento {
	private final DateTimeFormatter formatoCompleto = 
	        DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	    private final DateTimeFormatter formatoResumo = 
	        DateTimeFormatter.ofPattern("dd/MM HH:mm");
	    
	    @Override
	    public String formatarDataCompleta(EventoAgenda evento) {
	        return String.format("%s - %s às %s", 
	            evento.getTitulo(),
	            evento.getDataInicio().format(formatoCompleto),
	            evento.getDataFim().format(formatoCompleto));
	    }
	    
	    @Override
	    public String formatarResumo(EventoAgenda evento) {
	        return String.format("%s: %s", 
	            evento.getTitulo(),
	            evento.getDataInicio().format(formatoResumo));
	    }
}
