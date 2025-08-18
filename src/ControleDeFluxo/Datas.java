package ControleDeFluxo;

import java.time.LocalDate;

public class Datas {

	public static void main(String[] args) {
		/*
		 * LocalTime: representa uma hora do dia com os valores para hora, minuto,
		 * segundo e milissegundos. LocalDate: representa uma data com dia, mês e ano.
		 * LocalDateTime: representa uma data e hora. Month/Year/DayOfWeek/YearMonth:
		 * auxiliares de LocalDate para manipulações mais específicas. Instant: usado
		 * para cálculos computacionais com precisão de nanossegundos. Duration:
		 * diferença de tempo e cálculos baseados em horas. Period: diferença de datas e
		 * cálculos baseados em datas.
		 */
		
		
		LocalDate hoje = LocalDate.now();//Obtém a representação da data de hoje
	    LocalDate independencia = LocalDate.of(1822, 9, 7);//Obtém uma data específica
	    
	    System.out.println(hoje);
	    System.out.println(independencia);
	    
	}

}
