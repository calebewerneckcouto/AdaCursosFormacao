package Supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class IDAleatorio {
	public static void main(String[] args) {
	
		
		Supplier<String> idAleatorio = () -> UUID.randomUUID().toString();		
		System.out.println(idAleatorio.get());
		
	}
		

}
