
public class TestaCondicional3 {

	public static void main(String[] args) {
		
		System.out.println("Testando Condicionais"); // Ser� exibido na tela.
		
		int idade = 20; // Vari�vel declarada e atribu�do um valor.
		
		int quantidadePessoas = 2; // Vari�vel declarada e atribu�do um valor.
		
		//A condi��o s� vai ser validada, se as duas condi��es forem corretas.
		if (idade >= 18 && quantidadePessoas >= 2) {  
			 System.out.println("Seja Bem-Vindo!"); // Se a condi��o for verdadeira, ser� exibida na tela.
		} else {
			System.out.println("Infelizmente, voc� n�o pode entrar."); /* Se a condi��o for falsa, 
			ser� exibida na tela.*/
		}
	}
}
