
package DesafioProfessorPOO;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	

		 if (args.length == 0) {
	            System.out.println("Informe uma senha como parâmetro.");
	            return;
	        }

	        String senhaUsuario = args[0]; // pega a senha passada no terminal
		ValidadorSenha validador = new ValidadorSenha(senhaUsuario);

		if (validador.validar()) {
			System.out.println("Senha válida! Cadastro realizado com sucesso.");
		} else {
			System.out.println("Senha inválida! Ela deve ter pelo menos 8 caracteres, "
					+ "1 letra maiúscula, 1 letra minúscula, 1 número e 1 caractere especial.");
		}
	}
}
