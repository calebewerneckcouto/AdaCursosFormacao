package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	 public static void main(String[] args) {
		 Usuario usuario = new Usuario("Calebe", 25);
	        String caminhoArquivo = "usuario.ser"; // extensão típica para arquivos serializados

	        // Gravando o objeto no arquivo usando serialização
	        try (FileOutputStream fos = new FileOutputStream(caminhoArquivo);
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            oos.writeObject(usuario);
	            System.out.println("Objeto serializado gravado com sucesso!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Lendo o objeto do arquivo
	        try (FileInputStream fis = new FileInputStream(caminhoArquivo);
	             ObjectInputStream ois = new ObjectInputStream(fis)) {

	            Usuario usuarioLido = (Usuario) ois.readObject();
	            System.out.println("Objeto lido do arquivo:");
	            System.out.println(usuarioLido);

	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	}