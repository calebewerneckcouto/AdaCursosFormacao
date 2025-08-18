package RecordDesafio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Emprestavel> itens;

    public Biblioteca() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Emprestavel item) {
        itens.add(item);
        System.out.println("Item adicionado: " + item);
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Nenhum item na biblioteca.");
        } else {
            System.out.println("=== Itens da Biblioteca ===");
            for (var item : itens) {  // uso de var
                System.out.println(item);
            }
        }
    }
}
