package InterfaceADA;

public abstract class Ave {
    protected String nome;
    public Ave(String nome) { this.nome = nome; }
    public void descricao() { System.out.println("Sou uma ave chamada " + nome + ":"); }
    public void realizarAcoes() {
        if (this instanceof Voa) ((Voa) this).voar();
        if (this instanceof Nada) ((Nada) this).nadar();
        if (this instanceof Anda) ((Anda) this).andar();
    }
}