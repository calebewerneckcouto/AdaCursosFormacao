package AbertoFechado3;

import AbertoFechado.Professor;
import AbertoFechado.ProfessorEfetivo;
import AbertoFechado.ProfessorEmTreinamento;

public class Main {
	
	
	/*Exercício 3 - Estratégia de Avaliação

Uma escola avalia professores de diferentes formas:

Professor efetivo: nota baseada em desempenho e experiência.

Professor em treinamento: nota baseada apenas em participação.

Crie uma interface AvaliacaoStrategy com o método avaliar(Professor professor).

Crie duas implementações: AvaliacaoEfetivo e AvaliacaoTreinamento.

No main, atribua estratégias de avaliação a cada tipo de professor sem modificar o código existente.

👉 Dica: este exercício mistura OCP com Strategy Pattern.*/
	public static void main(String[] args) {
		Professor p1 = new ProfessorEfetivo("Luciana");
        Professor p2 = new ProfessorEmTreinamento("Pedro");

        AvaliacaoStrategy avaliacaoEfetivo = new AvaliacaoEfetivo();
        AvaliacaoStrategy avaliacaoTreinamento = new AvaliacaoTreinamento();

        Avaliador a1 = new Avaliador(avaliacaoEfetivo);
        Avaliador a2 = new Avaliador(avaliacaoTreinamento);

        a1.executarAvaliacao(p1);
        a2.executarAvaliacao(p2);
	}
}
