package PredicatesComposicao;

import java.util.function.Predicate;

public class Composicao {
	
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		Predicate<Integer> isPositive = x -> x > 0;

		Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
		Predicate<Integer> isEvenOrPositive = isEven.or(isPositive);
		Predicate<Integer> isNotEven = isEven.negate();

		int number = 4;

		System.out.println("Is " + number + " even and positive? " + isEvenAndPositive.test(number));
		System.out.println("Is " + number + " even or positive? " + isEvenOrPositive.test(number));
		System.out.println("Is " + number + " not even? " + isNotEven.test(number));
	}

}
