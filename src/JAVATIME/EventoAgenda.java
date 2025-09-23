package JAVATIME;

import java.time.Duration;
import java.time.LocalDateTime;

class EventoAgenda {
    private final String titulo;
    private final LocalDateTime dataInicio;
    private final LocalDateTime dataFim;
    private final String descricao;
    
    public EventoAgenda(String titulo, LocalDateTime dataInicio, LocalDateTime dataFim, String descricao) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
    }
    
    // Getters
    public String getTitulo() { return titulo; }
    public LocalDateTime getDataInicio() { return dataInicio; }
    public LocalDateTime getDataFim() { return dataFim; }
    public String getDescricao() { return descricao; }
    
    public Duration getDuracao() {
        return Duration.between(dataInicio, dataFim);
    }
}