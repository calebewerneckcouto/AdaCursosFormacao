package ProgramacaoFuncional;

import java.util.List;
import java.util.function.Predicate;

public class AnimalExemplo {
	
		
	public static void main(String[] args) {
        List<Animal> animais = List.of(
                new Animal("peixe", false, true),
                new Animal("canguru", true, false),
                new Animal("tartaruga", false, true),
                new Animal("gato", true, false)
            );

            print(animais, a -> a.podeNadar()); 
            print(animais,b -> b.podeSaltar());
        }

        private static void print(List<Animal> animais, Predicate<Animal> verificador) {
            for (Animal a : animais) {
                if (verificador.test(a)) {
                    System.out.println("Esses sao os animais que poderm nadar: " + a);
                }
            }
            
			for (Animal b : animais) {
				if (verificador.negate().test(b)) {
					System.out.println("Esses sao os animais que poderm saltar: " + b);
				}
			}
        }
}