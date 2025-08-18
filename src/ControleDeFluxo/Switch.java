package ControleDeFluxo;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Switch {
	
	public static void main(String[] args) {
		 DayOfWeek hoje = LocalDate.now().getDayOfWeek();
		    switch (hoje) {
		        case MONDAY, TUESDAY, WEDNESDAY, FRIDAY, THURSDAY:
		            System.out.println("Dia de Semana: " + hoje);
		            break;
		        case SATURDAY, SUNDAY:
		            System.out.println("Fim de Semana: " + hoje);
		            break;
		    }
	}

}
