package utilidades; // Esta Classe percente ao Pacote Utilidades

// Criação da Classe Funções Úteis
public class FuncoesUteis {
	
	// Método que faz a Altura do IMC ficar ao quadrado
	public static double aoQuadrado(double altura) {
		return altura * altura;
	}
	
	
	// Método que calcula o IMC
	public static double IMC(double altura, double peso) {
		return peso/aoQuadrado(altura); // Resultado do IMC usando o método da Altura ao quadrado
	}
	
	
	// Método para saber a Aprovação do Aluno
	public static void aprovacao(double nota, double percentual) {
		if(nota>=5 && percentual>=75) {
			System.out.println("Aprovação: Aprovado."); // Se a nota for maior ou igual a 5 e a presença maior do que 75%, Aluno Aprovado
		}
		else {
			System.out.println("Aprovação: Reprovado."); // Se a nota for menor do que 5 e a presença menor do que 75%, Aluno Reprovado
		}	
	}
	
	// Método para validação do CPF
	  public static boolean validaCPF(String cpf) {
	    	// Remove caracteres não numéricos
	        cpf = cpf.replaceAll("[^0-9]", "");
	
	        // Verifica se o CPF tem 11 dígitos
	        if (cpf.length() != 11 || cpf.chars().distinct().count() == 1) {
	            return false; // CPF inválido
	        }
	
	        // Cálculo do primeiro dígito verificador
	        int sum = 0;
	        for (int i = 0; i < 9; i++) {
	            sum += (cpf.charAt(i) - '0') * (10 - i);
	        }
	        int PrimeiroDigito = (sum * 10) % 11;
	        if (PrimeiroDigito == 10) PrimeiroDigito = 0;
	
	        // Cálculo do segundo dígito verificador
	        sum = 0;
	        for (int i = 0; i < 10; i++) {
	            sum += (cpf.charAt(i) - '0') * (11 - i);
	        }
	        int SegundoDigito = (sum * 10) % 11;
	        if (SegundoDigito == 10) SegundoDigito = 0;
	
	        // Verifica se os dígitos verificadores estão corretos
	        return PrimeiroDigito == (cpf.charAt(9) - '0') && SegundoDigito == (cpf.charAt(10) - '0');
	    }

	}

