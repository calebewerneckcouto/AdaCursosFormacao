package JAVATIME;

import java.time.LocalDateTime;

public class ValidadorDataFutura implements ValidadorEvento {
	
	 private String mensagemErro;
	    
	    @Override
	    public boolean validar(EventoAgenda evento) {
	        boolean valido = evento.getDataInicio().isAfter(LocalDateTime.now());
	        if (!valido) {
	            mensagemErro = "Evento deve ser agendado para o futuro";
	        }
	        return valido;
	    }
	    
	    @Override
	    public String getMensagemErro() { return mensagemErro; }

}
