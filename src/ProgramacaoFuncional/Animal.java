package ProgramacaoFuncional;

public class Animal {

    private String especie;
    private boolean podeSaltar;
    private boolean podeNadar;

    public Animal(String nomeDaEspecie, boolean saltador, boolean nadador) {
        this.especie = nomeDaEspecie;
        this.podeSaltar = saltador;
        this.podeNadar = nadador;
    }

    public boolean podeSaltar() {
        return podeSaltar;
    }

    public boolean podeNadar() {
        return podeNadar;
    }

    @Override
    public String toString() {
        return especie;
    }
}
