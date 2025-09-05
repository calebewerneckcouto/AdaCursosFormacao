package Formatadores;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatador {

	public static void main(String[] args) {

		Locale locale = new Locale("us", "US");
		int numero = 42;
		double numerodouble = 123.456789;

		double valor = 1234.2;

		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("us", "US"));
		System.out.println(nf.format(valor));

		String[] nomes = { "Calebe", "Laura", "Lurian" };
		int[] idades = { 25, 30, 28 };
		double[] alturas = { 1.65, 1.78, 1.70 };

		System.out.printf("%-10s %-5s %-6s%n", "Nome", "Idade", "Altura");
		for (int i = 0; i < nomes.length; i++) {
			System.out.printf("%-10s %-5d %-6.2f%n", nomes[i], idades[i], alturas[i]);
		}

		for (String nome : nomes) {
			System.out.println("-------------------------");
			System.out.println(nome);
			System.out.println("-------------------------");
		}

		System.out.println("-------------------------");
		System.out.printf(locale, "%05d%n", numero);
		System.out.println("-------------------------");
		System.out.printf(locale, "%.2f%n", numerodouble);
		System.out.println("-------------------------");
	}
}
