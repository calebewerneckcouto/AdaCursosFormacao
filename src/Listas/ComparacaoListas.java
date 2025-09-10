package Listas;

import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacaoListas {
    public static void main(String[] args) {

        // Testando ArrayList
        Instant inicioArray = Instant.now();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
        long tempoArray = Instant.now().toEpochMilli() - inicioArray.toEpochMilli();
        System.out.println("ArrayList - Tempo de inserção: " + tempoArray + " ms");

        // Testando LinkedList
        Instant inicioLinked = Instant.now();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
        long tempoLinked = Instant.now().toEpochMilli() - inicioLinked.toEpochMilli();
        System.out.println("LinkedList - Tempo de inserção: " + tempoLinked + " ms");
    }
}
