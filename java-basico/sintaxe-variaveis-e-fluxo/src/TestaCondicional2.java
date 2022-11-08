
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais"); // Será exibido na tela.

		int idade = 16; // Variável declarada e atribuído um valor.
		
		int quantidadePessoas = 1; // Variável declarada e atribuído um valor.

		   // Essa condição vai ocorrer, se todas ou apenas uma das condições estiver correta.
		if (idade >= 18 || quantidadePessoas >= 2) { 
			System.out.println("Seja bem-vindo!"); /* Será exibido na tela,
			 se todas ou apenas uma das condições estiver correta.*/
		} else {
			System.out.println(" Infefelizmente,você não pode entrar."); /* Será exibido na tela, 
			se nenhuma das condições estiverem corretas.*/
		}
	}
}
