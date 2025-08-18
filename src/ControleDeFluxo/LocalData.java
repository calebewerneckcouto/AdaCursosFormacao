package ControleDeFluxo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalData {

    public static void main(String[] args) {
    	
    	
    	//String para Datas
        // Data das Olimpíadas
        LocalDate olimpiadas = LocalDate.parse("26/07/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Data da Copa de Futebol
        LocalDate copaFutebol = LocalDate.parse("2026-06-11", DateTimeFormatter.ISO_DATE);

        System.out.println("Olimpíadas: " + olimpiadas.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Copa de Futebol: " + copaFutebol.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
