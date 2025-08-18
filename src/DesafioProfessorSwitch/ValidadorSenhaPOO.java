
package DesafioProfessorSwitch;

public class ValidadorSenhaPOO {
    private String senha;

    public ValidadorSenhaPOO(String senha) {
        this.senha = senha;
    }

    public boolean validar() {
        if (senha.length() < 8) return false;

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
            else temEspecial = true;
        }

        return temMaiuscula && temMinuscula && temNumero && temEspecial;
    }
}
