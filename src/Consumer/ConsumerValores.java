package Consumer;

import java.util.function.Consumer;

public class ConsumerValores {
public static void main(String[] args) {
	Consumer<String> imprimir = System.out::println;
	Consumer<Integer> quadradoEShow = n -> System.out.println(n * n);
	imprimir.accept("Hello, World!"); 	
	quadradoEShow.accept(5);
}
}
