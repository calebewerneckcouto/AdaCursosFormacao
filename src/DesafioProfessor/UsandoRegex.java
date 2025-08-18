package DesafioProfessor;

public class UsandoRegex {

	public static void main(String[] args) {
		/*
		 * Bom dia turma, espero que estejam bem. Que tal um desafio extra para fixar um
		 * pouco mais o que vimos em sala na aula de ontem?
		 * 
		 * Breve recapitulação: Um programa java básico, escrito em qualquer editor de
		 * texto, compilamos o programa pela linha de comando com a seguinte instrução:
		 * javac MeuPrimeiroPrograma.java O processo de compilação gerou um novo arquivo
		 * MeuPrimeiroPrograma.class, desde que não tenha nenhum erro de sintaxe no
		 * programa que foi escrito. Executar o programa com o comando java
		 * MeuPrimeiroPrograma
		 * 
		 * O desafio: Baseado no exemplo disponível no github crie um programa Java que
		 * recebe um parametro pela linha comando, tal como fizemos no exemplo Esse
		 * parâmetro será uma senha que um suposto usuário pretende cadastrar em sua
		 * conta de sua rede social hipotética. O programa deve validar se a senha
		 * atende aos critérios de segurança: No mínimo 8 caracteres, deve conter pelo
		 * menos 1 número, 1 letra maiúscula, 1 letra minúscula e 1 caracter especial.
		 * Se a senha informada atende ao critério dê uma mensagem de sucesso Se não
		 * atende dê uma mensagem de erro.
		 * 
		 * Quem topa?
		 * 
		 * Fico à disposição por aqui para apoiar em qualquer dificuldade.
		 * 
		 * Um abraço e boa diversão
		 */
		
		
		
		
	        if (args.length == 0) {
	            System.out.println("Informe uma senha como parâmetro.");
	            return;
	        }

	        String senha = args[0]; // pega a senha passada no terminal

	        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{8,}$";

	        if (senha.matches(regex)) {
	            System.out.println("Senha válida! Cadastro realizado com sucesso.");
	        } else {
	            System.out.println("Senha inválida! Certifique-se de atender todos os critérios.");
	        }
	    }
	}
		
		
	
