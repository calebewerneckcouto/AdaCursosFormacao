package Stream;

import java.util.*;
import java.util.stream.Collectors;

class Funcionario {
    String nome;
    String departamento;
    double salario;
    int idade;

    public Funcionario(String nome, String departamento, double salario, int idade) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " | " + departamento + " | R$" + salario + " | " + idade + " anos";
    }
}

