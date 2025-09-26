package Data;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class ResumaoData {
    public static void main(String[] args) {
        // 1. Criar LocalDate a partir de string
        LocalDate dataNascimento = LocalDate.parse("1990-05-15");
        System.out.println("Data de nascimento: " + dataNascimento);
        
        // 2. Criar LocalTime a partir de string
        LocalTime horaAlmoco = LocalTime.parse("12:30:00");
        System.out.println("Hora do almoço: " + horaAlmoco);
        
        // 3. Criar LocalDateTime a partir de string
        LocalDateTime dataHoraEvento = LocalDateTime.parse("2024-08-15T18:30:00");
        System.out.println("Data/hora do evento: " + dataHoraEvento);
        
        // 4. Formatação personalizada
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = dataHoraEvento.format(formatoBR);
        System.out.println("Data formatada (BR): " + dataFormatada);
        
        // 5. Converter string com formato customizado
        String dataCustomizada = "25-12-2024 20:00";
        DateTimeFormatter formatoCustom = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime natal = LocalDateTime.parse(dataCustomizada, formatoCustom);
        System.out.println("Data do Natal: " + natal);
        
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);
        
        // Operações básicas
        LocalDate amanha = hoje.plusDays(1);
        LocalDate semanaPassada = hoje.minusWeeks(1);
        LocalDate proximoMes = hoje.plusMonths(1);
        
        System.out.println("Amanhã: " + amanha);
        System.out.println("Semana passada: " + semanaPassada);
        System.out.println("Próximo mês: " + proximoMes);
        
        // Ajustes temporais
        LocalDate primeiroDiaMes = hoje.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate ultimoDiaMes = hoje.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate proximaSegunda = hoje.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        
        System.out.println("Primeiro dia do mês: " + primeiroDiaMes);
        System.out.println("Último dia do mês: " + ultimoDiaMes);
        System.out.println("Próxima segunda-feira: " + proximaSegunda);
        
        // Informações da data
        System.out.println("Dia da semana: " + hoje.getDayOfWeek());
        System.out.println("Dia do ano: " + hoje.getDayOfYear());
        System.out.println("É ano bissexto? " + hoje.isLeapYear());
        
        
        LocalDateTime agoraLocal = LocalDateTime.now();
        System.out.println("Data/hora local: " + agoraLocal);
        
        // Com fuso horário
        ZonedDateTime sp = ZonedDateTime.of(agoraLocal, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime ny = ZonedDateTime.of(agoraLocal, ZoneId.of("America/New_York"));
        ZonedDateTime tokyo = ZonedDateTime.of(agoraLocal, ZoneId.of("Asia/Tokyo"));
        
        System.out.println("São Paulo: " + sp);
        System.out.println("Nova York: " + ny);
        System.out.println("Tóquio: " + tokyo);
        
        // Conversão entre fusos
        ZonedDateTime spParaNy = sp.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("SP → NY: " + spParaNy);
        
        // Verificar horário de verão
        boolean veraoSP = ZoneId.of("America/Sao_Paulo")
                               .getRules()
                               .isDaylightSavings(sp.toInstant());
        System.out.println("Horário de verão em SP? " + veraoSP);
        
        // OffsetDateTime
        OffsetDateTime offsetSP = OffsetDateTime.of(agoraLocal, ZoneOffset.of("-03:00"));
        System.out.println("Offset SP: " + offsetSP);
        
        
        LocalDate nascimento = LocalDate.of(1990, 5, 15);
        
        
        Period periodo = Period.between(nascimento, hoje);
        System.out.println("Idade: " + periodo.getYears() + " anos, " + 
                         periodo.getMonths() + " meses, " + 
                         periodo.getDays() + " dias");
        
        // Duração (tempo)
        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);
        
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do trabalho: " + duracao.toHours() + " horas");
        
        // Cálculos com ChronoUnit
        long diasEntre = ChronoUnit.DAYS.between(nascimento, hoje);
        long mesesEntre = ChronoUnit.MONTHS.between(nascimento, hoje);
        
        System.out.println("Dias desde o nascimento: " + diasEntre);
        System.out.println("Meses desde o nascimento: " + mesesEntre);
        
        // Operações com Period e Duration
        LocalDate proximoAniversario = nascimento.plusYears(periodo.getYears() + 1);
        Period tempoProximoAniversario = Period.between(hoje, proximoAniversario);
        
        System.out.println("Próximo aniversário: " + proximoAniversario);
        System.out.println("Faltam: " + tempoProximoAniversario.getMonths() + 
                         " meses e " + tempoProximoAniversario.getDays() + " dias");
        
        
        Instant agora = Instant.now();
        System.out.println("Instant atual: " + agora);
        System.out.println("Epoch seconds: " + agora.getEpochSecond());
        
        // Converter para ZonedDateTime
        ZonedDateTime zoned = agora.atZone(ZoneId.of("America/Sao_Paulo"));
        System.out.println("ZonedDateTime: " + zoned);
        
        // Internacionalização
        ZonedDateTime dataHora = ZonedDateTime.now();
        
        // Formatação para diferentes países
        DateTimeFormatter formatacaoBR = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL)
            .withLocale(new Locale("pt", "BR"));
        
        DateTimeFormatter formatoUS = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL)
            .withLocale(Locale.US);
        
        DateTimeFormatter formatoJP = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL)
            .withLocale(Locale.JAPAN);
        
        System.out.println("\nFormatação internacional:");
        System.out.println("Brasil: " + dataHora.format(formatacaoBR));
        System.out.println("EUA: " + dataHora.format(formatoUS));
        System.out.println("Japão: " + dataHora.format(formatoJP));
        
        // Formato customizado com locale
        DateTimeFormatter customBR = DateTimeFormatter
            .ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'às' HH:mm", 
                      new Locale("pt", "BR"));
        
        System.out.println("Custom BR: " + dataHora.format(customBR));
        
        LocalDateTime checkIn = LocalDateTime.of(2024, 8, 1, 14, 0);
        LocalDateTime checkOut = LocalDateTime.of(2024, 8, 10, 12, 0);
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        System.out.println("=== SISTEMA DE RESERVAS ===");
        System.out.println("Check-in: " + checkIn.format(formato));
        System.out.println("Check-out: " + checkOut.format(formato));
        
        // Cálculo da estadia
        long diasHospedagem = ChronoUnit.DAYS.between(checkIn, checkOut);
        System.out.println("Dias de hospedagem: " + diasHospedagem);
        
        // Verificar se reserva é futura
        boolean isFutura = checkIn.isAfter(LocalDateTime.now());
        System.out.println("Reserva futura? " + isFutura);
        
        // Calcular tempo até check-in
        if (isFutura) {
            Period tempoAteCheckIn = Period.between(LocalDate.now(), checkIn.toLocalDate());
            System.out.println("Faltam " + tempoAteCheckIn.getMonths() + 
                             " meses e " + tempoAteCheckIn.getDays() + " dias para o check-in");
        }
        
        // Horários considerando fuso horário do hotel (Nova York)
        ZonedDateTime checkInNY = checkIn.atZone(ZoneId.of("America/New_York"));
        ZonedDateTime checkInSP = checkInNY.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));
        
        System.out.println("\nHorários convertidos:");
        System.out.println("Check-in NY: " + checkInNY);
        System.out.println("Check-in SP: " + checkInSP);
        
        // Validar reserva (mínimo 1 dia, máximo 30 dias)
        if (diasHospedagem < 1) {
            System.out.println("ERRO: Reserva deve ser de pelo menos 1 dia");
        } else if (diasHospedagem > 30) {
            System.out.println("ERRO: Reserva máxima é de 30 dias");
        } else {
            System.out.println("Reserva válida!");
        }
    }
    }
