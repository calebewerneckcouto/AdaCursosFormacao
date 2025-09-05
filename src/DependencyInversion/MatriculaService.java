package DependencyInversion;

public class MatriculaService {
    private final ComunicacaoService comunicacaoService;

    public MatriculaService(ComunicacaoService comunicacaoService) {
        this.comunicacaoService = comunicacaoService;
    }

    public void realizarMatricula(Aluno aluno) {
        // Realiza matrícula (simulado)
        String mensagem = "Matrícula realizada para " + aluno.getNome();
        comunicacaoService.send(mensagem, aluno.getDestinatario());
    }
}
