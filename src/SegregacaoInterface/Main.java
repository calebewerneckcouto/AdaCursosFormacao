package SegregacaoInterface;

public class Main {
	public static void main(String[] args) {
		EngenheiroSoftware fullStack = new EngenheiroSoftware();
		ProgramadorJunior dev = new ProgramadorJunior();
		AnalistaQA qa = new AnalistaQA();

		fullStack.codificar();
		fullStack.documentarRequisitos();
		fullStack.testar();
		fullStack.disponibilizar();

		dev.codificar();
		qa.testar();
	}

}
