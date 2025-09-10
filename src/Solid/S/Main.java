package Solid.S;

public class Main {
	public static void main(String[] args) {
		RelatorioFinanceiro relatorio = new RelatorioFinanceiro();
		relatorio.gerarRelatorio();
		relatorio.salvarEmArquivo("Relatório Financeiro");
	}
}
