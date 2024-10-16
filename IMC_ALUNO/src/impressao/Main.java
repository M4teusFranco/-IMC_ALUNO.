package impressao; // Esta Classe percente ao Pacote Impressão
import individuos.Aluno; // Importação do Pacote Aluno
import individuos.Pessoa; // Importação do Pacote Pessoa
import utilidades.FuncoesUteis; // Importação do Pacote Funções Úteis

	public class Main {
		
		public static void main(String args[]) {
			
			// Trecho em que será exibido o Resultado do IMC
			System.out.println("- IMC - ");
				// Inserção da Altura e Peso do Aluno
				double resultadoIMC = FuncoesUteis.IMC(1.70, 71.0);
					//Exibição do IMC
					System.out.println("IMC: " +resultadoIMC+"\n");
		
			// Trecho em que será exibido o Resultado do IMC
			System.out.println("- Aprovação - ");
				// Inserção da Nota e Percentual de presença do Aluno. O resultado também sera exibido
				FuncoesUteis.aprovacao(6.0, 80.0);
					System.out.println("\n"); // Pulador de linha
			
			// Trecho em que será exibida a Validação do CPF
			System.out.println("- CPF - ");
				// Inserção do CPF do Aluno
				String cpf = "574.513.408-99";
					// Exibições da Validação
					if (FuncoesUteis.validaCPF(cpf)) {
				            System.out.println("CPF: "+cpf+" (CPF é válido)"); // Se o CPF for Válido
				        } else {
				            System.out.println("CPF: CPF é inválido."); // Se o CPF for Inválido
				        }
			}
	}
