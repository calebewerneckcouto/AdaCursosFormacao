package BiPredicate;

import java.util.function.BiPredicate;

public class VeriicaCondicao {
	
public static void main(String[] args) {
	BiPredicate<String, Integer> temTamanhoMaiorQue = (s, n) -> s.length() > n;
	System.out.println(temTamanhoMaiorQue.test("Hello", 3)); 
}

}
