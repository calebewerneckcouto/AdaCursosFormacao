package Data;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleDatas {
	public static void main(String[] args) {
        ZonedDateTime agora = ZonedDateTime.now();

        DateTimeFormatter formatoBR = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(new Locale("pt", "BR"));
        DateTimeFormatter formatoUS = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.US);
        DateTimeFormatter formatoJP = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG).withLocale(Locale.JAPAN);

        System.out.println("Brasil: " + agora.format(formatoBR));
        System.out.println("Estados Unidos: " + agora.format(formatoUS));
        System.out.println("Japão: " + agora.format(formatoJP));
    }
}
