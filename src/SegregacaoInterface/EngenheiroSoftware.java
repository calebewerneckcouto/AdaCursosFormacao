package SegregacaoInterface;

public class EngenheiroSoftware implements Desenvolvedor, AnalistaRequisitos, AnalistaQualidade, EngenheiroDevops {
    @Override
    public void codificar() {
        System.out.println("Codificando features...");
    }

    @Override
    public void documentarRequisitos() {
        System.out.println("Documentando requisitos do cliente...");
    }

    @Override
    public void testar() {
        System.out.println("Testando a aplicação...");
    }

    @Override
    public void disponibilizar() {
        System.out.println("Realizando deploy da aplicação...");
    }
}