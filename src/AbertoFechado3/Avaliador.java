package AbertoFechado3;

import AbertoFechado.Professor;

public class Avaliador {
    private AvaliacaoStrategy strategy;

    public Avaliador(AvaliacaoStrategy strategy) {
        this.strategy = strategy;
    }

    public void executarAvaliacao(Professor professor) {
        strategy.avaliar(professor);
    }
}