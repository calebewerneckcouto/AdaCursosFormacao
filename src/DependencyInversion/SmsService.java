package DependencyInversion;

public class SmsService implements ComunicacaoService {
    @Override
    public void send(String mensagem, String destinatario) {
        System.out.println("Enviando SMS para " + destinatario + ": " + mensagem);
    }
}