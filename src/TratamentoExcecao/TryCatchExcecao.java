package TratamentoExcecao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExcecao {

	public static void main(String[] args) {
		FileReader reader = null;
	    try {
	        File file = new File("nonexistentfile.txt");
	        reader = new FileReader(file);
	    } catch (FileNotFoundException e) {
	        System.err.println("File not found: " + e.getMessage());
	    } catch (Exception e) {
	        System.err.println("Erro inesperado: " + e.getMessage());
	    } finally {
	        if (reader != null) {
	            try {
	                reader.close();
	            } catch (IOException e) {
	                System.err.println("Erro ao fechar o arquivo: " + e.getMessage() + ".");
	            }
	        }
	    }
	}

	}


