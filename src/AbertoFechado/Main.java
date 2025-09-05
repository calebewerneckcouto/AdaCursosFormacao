package AbertoFechado;

public class Main {
	
	
	/*Implemente um sistema de pagamento de professores.

Crie uma classe base Professor com o atributo nome.

Crie duas subclasses: ProfessorEfetivo e ProfessorEmTreinamento.

Crie uma interface PagamentoService com o método pagar().

Crie duas implementações dessa interface: PagamentoEfetivoService e PagamentoTreinamentoService.

No main, crie uma lista de professores de tipos diferentes e execute os pagamentos sem precisar alterar a classe base.

👉 Dica: Use polimorfismo para evitar ifs no código.*/
	
	
	public static void main(String[] args) {
		Professor p1 = new ProfessorEfetivo("João");
		Professor p2 = new ProfessorEmTreinamento("Maria");
		
		PagamentoEfetivoService ps1 = new PagamentoEfetivoService();
		PagamentoTreinamentoService ps2 = new PagamentoTreinamentoService();
		
		ps1.pagar(p1);
		ps2.pagar(p2);
		
	}

}
