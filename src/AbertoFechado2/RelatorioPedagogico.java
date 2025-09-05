package AbertoFechado2;

import AbertoFechado.Professor;

public class RelatorioPedagogico implements RelatorioProfessor {

	@Override
	public void gerarRelatorio(Professor professor) {
		System.out.println("Gerando relatório pedagógico para o professor: " + professor.getNome());
		
	}

}
