package AbertoFechado3;

import AbertoFechado.Professor;

public class AvaliacaoEfetivo implements AvaliacaoStrategy{
	
	

	@Override
	public void avaliar(Professor professor) {
		System.out.println("Avaliando efetivo " + professor.getNome() + " por desempenho e experiência.");
    }
		
	}


