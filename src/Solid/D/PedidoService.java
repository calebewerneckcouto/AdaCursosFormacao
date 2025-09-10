package Solid.D;

class PedidoService {
    private MySQLPedidoRepository repo = new MySQLPedidoRepository();

    public void processarPedido(String pedido) {
        repo.salvarPedido(pedido);
    }
}