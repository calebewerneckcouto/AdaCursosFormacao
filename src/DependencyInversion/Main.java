package DependencyInversion;

public class Main {
    public static void main(String[] args) {
        // Aluno com email
        Aluno alunoEmail = new Aluno("Maria", "maria@email.com");
        ComunicacaoService emailService = new EmailService();
        MatriculaService matriculaEmail = new MatriculaService(emailService);
        matriculaEmail.realizarMatricula(alunoEmail);

        // Aluno com WhatsApp
        Aluno alunoWhats = new Aluno("João", "+55 3199999-0000");
        ComunicacaoService whatsappService = new WhatsappService("+55 3191111-2222");
        MatriculaService matriculaWhats = new MatriculaService(whatsappService);
        matriculaWhats.realizarMatricula(alunoWhats);
    }
}
