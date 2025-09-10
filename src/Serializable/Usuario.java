package Serializable;

import java.io.*;

// Classe implementando Serializable
class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nome;
    private int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}