package Stream;

public class Venda {
	private String produto;
	private double preco;
	private String categoria;
	private int quantidade;

	public Venda(String produto, double preco, String categoria, int quantidade) {
		this.produto = produto;
		this.preco = preco;
		this.categoria = categoria;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public double getPreco() {
		return preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
