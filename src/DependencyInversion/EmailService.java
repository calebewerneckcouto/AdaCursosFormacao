package DependencyInversion;

public class EmailService implements ComunicacaoService {

    @Override
    public void send(String mensagem, String destinatario) {
        System.out.println("Enviando EMAIL para " + destinatario + ": " + mensagem);
    }
}
