package InterfacesComparable;

public class Empregado implements Comparable {
    private int matricula;
    private String nome;

    // Construtor
    public Empregado(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    // Getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    // Implementação do compareTo (compara pela matrícula)
    @Override
    public int compareTo(Object other) {
        Empregado empregado = (Empregado) other;

        if (this.matricula < empregado.matricula) {
            return -1; // this < other
        }
        if (this.matricula > empregado.matricula) {
            return 1; // this > other
        }
        return 0; // iguais
    }

    @Override
    public String toString() {
        return "Empregado { matricula=" + matricula + ", nome='" + nome + "' }";
    }
}
