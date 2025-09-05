package DependencyInversion;

public class Aluno {
    private String nome;
    private String contato; // pode ser email ou número do WhatsApp

    public Aluno(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getDestinatario() {
        return contato;
    }
}
