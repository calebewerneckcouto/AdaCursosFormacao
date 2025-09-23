package Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Local {

	public static void main(String[] args) {

		// Obtendo data e hora atual nas diferentes classes
		LocalDate d01 = LocalDate.now(); // Data atual (sem hora)
		LocalDateTime d02 = LocalDateTime.now(); // Data e hora atual
		Instant d03 = Instant.now();
		
		
		

		// Soma 5 dias no Instant
		Instant plus5Days = d03.plus(5, ChronoUnit.DAYS);

		// Converte Instant para LocalDate no fuso do sistema
		LocalDate localDatePlus5 = plus5Days.atZone(ZoneId.systemDefault()).toLocalDate();

		// Formata só a data (sem hora)
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String formattedDate = localDatePlus5.format(fmt);

		System.out.println("+5 DIAS (Instant original): " + plus5Days);
		System.out.println("+5 DIAS (Só data, local): " + formattedDate);
		// Parse de strings em formatos ISO8601 padrão
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

		// Parse usando DateTimeFormatter customizado para LocalDate
		DateTimeFormatter fmtDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d07 = LocalDate.parse("20/07/2022", fmtDate);

		// Parse usando DateTimeFormatter customizado para LocalDateTime
		DateTimeFormatter fmtDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d08 = LocalDateTime.parse("20/07/2022 01:30", fmtDateTime);

		// Criando objetos LocalDate e LocalDateTime diretamente com valores específicos
		LocalDate d09 = LocalDate.of(2022, 11, 20);
		LocalDateTime d10 = LocalDateTime.of(2022, 7, 20, 1, 30);

		System.out.println("=== Datas e Horas Atuais ===");
		System.out.println("LocalDate.now(): " + d01);
		System.out.println("LocalDateTime.now(): " + d02);
		System.out.println("Instant.now() (UTC): " + d03);
		System.out.println();

		System.out.println("=== Parse de Strings (ISO8601) ===");
		System.out.println("LocalDate.parse(\"2022-07-20\"): " + d04);
		System.out.println("LocalDateTime.parse(\"2022-07-20T01:30:26\"): " + d05);
		System.out.println("Instant.parse(\"2022-07-20T01:30:26Z\"): " + d06);
		System.out.println();

		System.out.println("=== Parse com DateTimeFormatter customizado ===");
		System.out.println("LocalDate.parse(\"20/07/2022\", fmtDate): " + d07);
		System.out.println("LocalDateTime.parse(\"20/07/2022 01:30\", fmtDateTime): " + d08);
		System.out.println();

		System.out.println("=== Criação direta com of() ===");
		System.out.println("LocalDate.of(2022, 11, 20): " + d09);
		System.out.println("LocalDateTime.of(2022, 7, 20, 1, 30): " + d10);
	}
}
