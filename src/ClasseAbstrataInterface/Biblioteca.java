package ClasseAbstrataInterface;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Catalogavel> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    // Adicionar item ao catálogo
    public void adicionarItem(Catalogavel item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item.getTitulo());
    }

    // Buscar por título
    public Catalogavel buscarPorTitulo(String titulo) {
        for (Catalogavel item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }

    // Filtrar por categoria
    public List<Catalogavel> filtrarPorCategoria(String categoria) {
        List<Catalogavel> resultado = new ArrayList<>();
        for (Catalogavel item : itens) {
            if (item.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(item);
            }
        }
        return resultado;
    }

    // Listar todos os itens
    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item no catálogo.");
        } else {
            System.out.println("=== Itens da Biblioteca ===");
            for (Catalogavel item : itens) {
                System.out.println(item);
            }
        }
    }
}
