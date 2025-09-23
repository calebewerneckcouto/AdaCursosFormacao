package Data;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Leo {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ZoneId zona = ZoneId.systemDefault();

		DateTimeFormatter formatoEntrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Digite a data atual (formato DD/MM/YYYY):");
		String dataAtualStr = scanner.nextLine();

		LocalDate dataAtual = LocalDate.parse(dataAtualStr, formatoEntrada);

		Instant dataAtualInstant = dataAtual.atStartOfDay(zona).toInstant();

		LocalDate natalDate = LocalDate.of(dataAtual.getYear(), Month.DECEMBER, 25);
		if (dataAtual.isAfter(natalDate)) {
			natalDate = LocalDate.of(dataAtual.getYear() + 1, Month.DECEMBER, 25);
		}
		Instant natalInstant = natalDate.atStartOfDay(zona).toInstant();

		LocalDate anoNovoDate = LocalDate.of(natalDate.getYear() + 1, Month.JANUARY, 1);
		Instant anoNovoInstant = anoNovoDate.atStartOfDay(zona).toInstant();

		long diasAteNatal = ChronoUnit.DAYS.between(dataAtualInstant, natalInstant);

		if (dataAtualInstant.isBefore(natalInstant)) {
			System.out.println("Faltam " + diasAteNatal + " dias para o Natal!");
		} else if (dataAtualInstant.equals(natalInstant)) {
			System.out.println("Hoje é Natal! Ebbbbbbbbbbbaaaaaaaaaaaaaa!");
		} else if (dataAtualInstant.isAfter(natalInstant) && dataAtualInstant.isBefore(anoNovoInstant)) {
			long diasParaAnoNovo = ChronoUnit.DAYS.between(dataAtualInstant, anoNovoInstant);
			System.out.println(
					"Estamos entre o Natal e o Ano Novo. Faltam " + diasParaAnoNovo + " dias para o Ano Novo!");
		} else if (dataAtualInstant.equals(anoNovoInstant)) {
			System.out.println("Hoje é Ano Novo! Bora beber, cair e levantar!");
		} else {
			System.out.println("A data atual é após o Ano Novo. Você tem 365 oportunidades!");
		}

		scanner.close();
	}
}
