
public class TestaCondicional4 {

	public static void main(String[] args) {
		
		int idade = 20;  // Vari�vel declarada e atribu�do um valor.
		
		boolean acompanhado = true;// Boolean declarado e sua condi��o.
		   
		    // Condi��o que vai ser validada, se as duas condi��es forem corretas.
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja Bem-Vindo!"); // Se a condi��o for verdadeira, ser� exibida na tela.
		} else {
			System.out.println("Infelizmente, voc� n�o pode entrar."); /* Se a condi��o for falsa, 
			ser� exibida na tela.*/
		}
	}
}
