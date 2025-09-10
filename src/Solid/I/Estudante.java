package Solid.I;

public class Estudante implements Trabalhador {
    public void trabalhar() { 
        // Não faz sentido para estudante
    }
    public void estudar() {
        System.out.println("Estudante estudando...");
    }
}