package AbertoFechado3;

import AbertoFechado.Professor;

public class AvaliacaoTreinamento implements AvaliacaoStrategy {

	@Override
	public void avaliar(Professor professor) {
		  System.out.println("Avaliando treinamento " + professor.getNome() + " por participação.");
		
	}

}
