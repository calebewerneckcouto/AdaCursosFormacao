package JAVATIME;

import java.time.Duration;

public class ValidadorDuracao implements ValidadorEvento{

	 private final Duration duracaoMinima;
	    private String mensagemErro;
	    
	    public ValidadorDuracao(Duration duracaoMinima) {
	        this.duracaoMinima = duracaoMinima;
	    }
	    
	    @Override
	    public boolean validar(EventoAgenda evento) {
	        boolean valido = evento.getDuracao().compareTo(duracaoMinima) >= 0;
	        if (!valido) {
	            mensagemErro = "Evento deve ter duração mínima de " + duracaoMinima.toMinutes() + " minutos";
	        }
	        return valido;
	    }
	    
	    @Override
	    public String getMensagemErro() { return mensagemErro; }

}
