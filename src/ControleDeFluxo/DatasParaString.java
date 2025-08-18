package ControleDeFluxo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasParaString {
    
    public static void main(String[] args) {
    	
    	//de data para string
    	
        // Criando uma data (26 de julho de 2024)
        LocalDate olimpiadas = LocalDate.of(2024, 7, 26);

        // Definindo o formato desejado
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Convertendo para String
        String sOlimpiadas = olimpiadas.format(formato);

        System.out.println("Data formatada: " + sOlimpiadas);
    }
}
