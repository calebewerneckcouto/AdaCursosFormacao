package AbertoFechado;

public class PagamentoEfetivoService implements PagamentoService {
	

	@Override
	public void pagar(Professor professor) {
		System.out.println("Pagamento efetuado para o professor Efetivo: " + professor.getNome());
		
	}

}
