package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Zone {
	
	public static void main(String[]args) {
		
		// Instante em formato ISO-8601 com fuso horário (necessário para Instant.parse)
        Instant d01 = Instant.parse("2024-11-20T00:00:00Z"); // UTC (Z)
        
        // Formato da data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Criar um LocalDate a partir de uma string
        LocalDate hoje = LocalDate.parse("20/11/2024", formatter);

        // Imprimir o resultado
        System.out.println("Data: " + hoje);

        // Converter Instant para LocalDate considerando o fuso horário do sistema
        LocalDate localDate = d01.atZone(ZoneId.systemDefault()).toLocalDate();

        // Imprimir o LocalDate
        System.out.println("LocalDate: " + localDate);
		//Imprimir os ZoneId para saber qual ultilizar
        
        
		
		
	}

}