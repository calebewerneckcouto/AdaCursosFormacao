package Listas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();
        lista.add("Ana");
        lista.add(123);
        lista.add(45.67);
        lista.add(true);

        for (Object elemento : lista) {
            System.out.println("Elemento: " + elemento + " - Tipo: " + elemento.getClass().getSimpleName());
        }
    }
}
