package StringBuilder;

public class FraseCompleta {
	
	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		stringBuilder.append("Calebe ");
		stringBuilder.append("Werneck ");
		stringBuilder.append("Couto");
		
		System.out.println("Frase Completa: " + stringBuilder.toString());
	}

}
