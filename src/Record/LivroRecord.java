package Record;

// Record para representar dados de um livro
public record LivroRecord(String titulo, String autor, int anoPublicacao) {
    // Podemos adicionar métodos se quisermos
    public String resumo() {
        return titulo + " de " + autor + " (" + anoPublicacao + ")";
    }
}
