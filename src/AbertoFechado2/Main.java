package AbertoFechado2;

import AbertoFechado.Professor;
import AbertoFechado.ProfessorEfetivo;
import AbertoFechado.ProfessorEmTreinamento;

public class Main {
	
	/*Exercício 2 - Relatórios de Professores

Crie uma interface RelatorioProfessor com o método gerarRelatorio().

Crie duas implementações:

RelatorioFinanceiro (gera relatório de pagamentos).

RelatorioPedagogico (gera relatório de atividades pedagógicas).

No main, adicione dinamicamente novos tipos de relatórios sem modificar a classe base.

👉 Dica: pense como adicionar novos relatórios sem precisar mexer no código já pronto.*/
	
	public static void main(String[] args) {
		Professor professor = new ProfessorEfetivo("João Silva");
		Professor professor2 = new ProfessorEmTreinamento("Maria Souza");
		RelatorioProfessor r1 = new RelatorioFinanceiro();
		RelatorioProfessor r2 = new RelatorioPedagogico();
		
		r1.gerarRelatorio(professor);
		r2.gerarRelatorio(professor2);	
	}

}
