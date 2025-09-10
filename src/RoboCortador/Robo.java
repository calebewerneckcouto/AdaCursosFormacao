package RoboCortador;

class RoboCortadorPizza {
    private Cortador cortador;

    public RoboCortadorPizza(Cortador cortador) {
        this.cortador = cortador;
    }

    public void executarCorte() {
        cortador.cortar();
    }
}
