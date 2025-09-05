package DependencyInversion;

public class WhatsappService implements ComunicacaoService {

    private String numeroRemetente;

    public WhatsappService(String numeroRemetente) {
        this.numeroRemetente = numeroRemetente;
    }

    @Override
    public void send(String mensagem, String destinatario) {
        System.out.println("Enviando WHATSAPP do número " + numeroRemetente +
                           " para " + destinatario + ": " + mensagem);
    }
}
