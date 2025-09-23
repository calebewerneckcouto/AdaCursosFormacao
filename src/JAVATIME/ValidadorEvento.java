package JAVATIME;

public interface ValidadorEvento {
	boolean validar(EventoAgenda evento);

	String getMensagemErro();
}
