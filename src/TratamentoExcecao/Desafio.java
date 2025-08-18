package TratamentoExcecao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		/*
		 * Estudo de caso Agenda de compromissos de trabalho. Só deve permitir
		 * agendamentos em dias e horários de trabalho.
		 * 
		 * Desafio Pesquisar e usar o try-with-resources para manipulação do Scanner.
		 */

		// try-with-resources garante que o Scanner seja fechado automaticamente
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Bem-vindo à Agenda de Compromissos!");

			// Solicitar data do compromisso
			System.out.print("Digite a data do compromisso (AAAA-MM-DD): ");
			String dataStr = scanner.nextLine();
			LocalDate data = LocalDate.parse(dataStr);

			// Verificar se é dia útil
			DayOfWeek diaSemana = data.getDayOfWeek();
			if (diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY) {
				System.out.println("Erro: Não é permitido agendar compromissos em finais de semana!");
				return;
			}

			// Solicitar horário do compromisso
			System.out.print("Digite o horário do compromisso (HH:MM): ");
			String horaStr = scanner.nextLine();
			LocalTime hora = LocalTime.parse(horaStr);

			// Verificar horário comercial (09:00 - 18:00)
			LocalTime inicioExpediente = LocalTime.of(9, 0);
			LocalTime fimExpediente = LocalTime.of(18, 0);

			if (hora.isBefore(inicioExpediente) || hora.isAfter(fimExpediente)) {
				System.out.println("Erro: O horário deve estar dentro do expediente (09:00 - 18:00)!");
				return;
			}

			// Agendamento válido
			System.out.println("Compromisso agendado com sucesso em " + data + " às " + hora + "!");
		} catch (Exception e) {
			System.out.println("Erro: Entrada inválida. Certifique-se de usar o formato correto.");
		}
	}
}
