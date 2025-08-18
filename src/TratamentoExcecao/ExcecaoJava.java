package TratamentoExcecao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcecaoJava {
	
	public static void main(String[] args) {
		try {
	        File file = new File("nonexistentfile.txt");
	        FileReader reader = new FileReader(file);
	    } catch (FileNotFoundException e) {
	        System.err.println("File not found: " + e.getMessage());
	    } catch (Exception e) {
	        System.err.println("Erro inesperado: " + e.getMessage());
	    }
	}

}
