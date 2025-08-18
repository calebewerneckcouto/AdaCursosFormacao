// Arquivo: ProgramaPrincipal.java
package DesafioProfessorSwitch;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha a ser validada:");
        String senha = sc.nextLine();

        System.out.println("Escolha o método de validação:");
        System.out.println("1 - Simples");
        System.out.println("2 - Regex");
        System.out.println("3 - POO");
        int opcao = sc.nextInt();

        boolean senhaValida = false;

        switch (opcao) {
            case 1: // Método simples
                senhaValida = validarSimples(senha);
                break;
            case 2: // Regex
                senhaValida = validarRegex(senha);
                break;
            case 3: // POO
                ValidadorSenhaPOO validador = new ValidadorSenhaPOO(senha);
                senhaValida = validador.validar();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        if (senhaValida) {
            System.out.println("Senha válida! Cadastro realizado com sucesso.");
        } else {
            System.out.println("Senha inválida! Ela deve ter pelo menos 8 caracteres, 1 letra maiúscula, 1 letra minúscula, 1 número e 1 caractere especial.");
        }

        sc.close();
    }

    // Validação simples (manual)
    public static boolean validarSimples(String senha) {
        if (senha.length() < 8) return false;

        boolean maiuscula = false, minuscula = false, numero = false, especial = false;
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) maiuscula = true;
            else if (Character.isLowerCase(c)) minuscula = true;
            else if (Character.isDigit(c)) numero = true;
            else especial = true;
        }
        return maiuscula && minuscula && numero && especial;
    }

    // Validação usando Regex
    public static boolean validarRegex(String senha) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).{8,}$";
        return Pattern.matches(regex, senha);
    }
}
