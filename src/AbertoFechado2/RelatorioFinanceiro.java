package AbertoFechado2;

import AbertoFechado.Professor;

public class RelatorioFinanceiro implements RelatorioProfessor {

	@Override
	public void gerarRelatorio(Professor professor) {
		System.out.println("Gerando relatorio financeiro do professor: " + professor.getNome());
	}
	

}
