package InterfacesComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando alguns empregados
        Empregado joao = new Empregado(102, "João");
        Empregado maria = new Empregado(101, "Maria");
        Empregado carlos = new Empregado(103, "Carlos");

        // Comparando diretamente dois empregados
        int result = joao.compareTo(maria);

        System.out.println("Comparando João e Maria: " + result);
        // Se < 0 → João vem antes de Maria
        // Se > 0 → João vem depois de Maria
        // Se = 0 → iguais

        // Criando lista de empregados
        List<Empregado> lista = new ArrayList<>();
        lista.add(joao);
        lista.add(maria);
        lista.add(carlos);

        System.out.println("\nLista antes da ordenação:");
        for (Empregado e : lista) {
            System.out.println(e);
        }

        // Ordenando a lista (usa o compareTo da classe Empregado)
        Collections.sort(lista, (a, b) -> a.compareTo(b));

        System.out.println("\nLista depois da ordenação:");
        for (Empregado e : lista) {
            System.out.println(e);
        }
    }
}
