package StringBuffer;
public class ExemploStringBuffer {
    public static void main(String[] args) {
        
        // Criando um StringBuffer
        StringBuffer sb = new StringBuffer("Olá");

        // Adicionando texto
        sb.append(" mundo!");
        System.out.println("Append: " + sb);

        // Inserindo em uma posição específica
        sb.insert(3, " Java");
        System.out.println("Insert: " + sb);

        // Substituindo uma parte do texto
        sb.replace(0, 3, "Oi");
        System.out.println("Replace: " + sb);

        // Deletando parte do texto
        sb.delete(3, 8);
        System.out.println("Delete: " + sb);

        // Invertendo o texto
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // Voltando ao normal para continuar
        sb.reverse();

        // Pegando capacidade do buffer (tamanho alocado)
        System.out.println("Capacidade: " + sb.capacity());

        // Pegando o tamanho real do conteúdo
        System.out.println("Comprimento: " + sb.length());
    }
}
