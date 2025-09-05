package AbertoFechado;

public class PagamentoTreinamentoService implements PagamentoService {
	

	@Override
	public void pagar(Professor professor) {
		System.out.println("Pagamento efetuado para o professor Treinamento: " + professor.getNome());
		
	}

}
