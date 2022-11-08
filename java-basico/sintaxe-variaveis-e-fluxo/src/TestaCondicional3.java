
public class TestaCondicional3 {

	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais"); // Será exibido na tela.
		
		int idade = 20; // Variável declarada e atribuído um valor.
		
		int quantidadePessoas = 2; // Variável declarada e atribuído um valor.
		
		//A condição só vai ser validada, se as duas condições forem corretas.
		if (idade >= 18 && quantidadePessoas >= 2) {  
			 System.out.println("Seja Bem-Vindo!"); // Se a condição for verdadeira, será exibida na tela.
		} else {
			System.out.println("Infelizmente, você não pode entrar."); /* Se a condição for falsa, 
			será exibida na tela.*/
		}
	}
}
