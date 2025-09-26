package Data;

import java.time.Duration;
import java.time.LocalTime;

public class DurationDatas {
	public static void main(String[] args) {
        LocalTime inicio = LocalTime.of(10, 0);
        LocalTime fim = LocalTime.of(12, 45);

        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração: " + duracao);
    }
}
