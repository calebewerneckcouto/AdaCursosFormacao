package DesafioProfessorPOO;

public class ValidadorSenha {

    private String senha;

    // Construtor
    public ValidadorSenha(String senha) {
        this.senha = senha;
    }

    // Método para validar a senha
    public boolean validar() {
        if (senha.length() < 8) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
            else temEspecial = true; // qualquer caractere que não seja letra ou número
        }

        return temMaiuscula && temMinuscula && temNumero && temEspecial;
    }
}
