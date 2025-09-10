package Solid.O;

class CalculadoraDesconto {
    public double calcular(String tipoCliente, double valor) {
        if (tipoCliente.equals("VIP")) {
            return valor * 0.8;
        } else if (tipoCliente.equals("NORMAL")) {
            return valor * 0.9;
        }
        return valor;
    }
}