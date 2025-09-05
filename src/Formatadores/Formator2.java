package Formatadores;

import java.util.Locale;

public class Formator2 {
    public static void main(String[] args) {
        Locale locale = new Locale("us");
        double valor = 0.756;
        System.out.printf(locale, "%.2f%%", valor * 100); 
    }
}
