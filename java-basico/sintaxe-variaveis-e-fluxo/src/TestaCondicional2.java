
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando Condicionais"); // Ser� exibido na tela.

		int idade = 16; // Vari�vel declarada e atribu�do um valor.
		
		int quantidadePessoas = 1; // Vari�vel declarada e atribu�do um valor.

		   // Essa condi��o vai ocorrer, se todas ou apenas uma das condi��es estiver correta.
		if (idade >= 18 || quantidadePessoas >= 2) { 
			System.out.println("Seja bem-vindo!"); /* Ser� exibido na tela,
			 se todas ou apenas uma das condi��es estiver correta.*/
		} else {
			System.out.println(" Infefelizmente,voc� n�o pode entrar."); /* Ser� exibido na tela, 
			se nenhuma das condi��es estiverem corretas.*/
		}
	}
}
