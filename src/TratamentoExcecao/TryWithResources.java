package TratamentoExcecao;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
	
	public static void main(String[] args) {
		File file = new File("nonexistentfile.txt");
	    try (FileReader reader = new FileReader(file)) {
	        //leitura do arquivo
	    } catch (IOException e) {
	        System.err.println("Erro inesperado: " + e.getMessage());
	    }
	}
	}


